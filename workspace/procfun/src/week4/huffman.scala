package week4

abstract class CodeTree
case class Fork(left: CodeTree, right: CodeTree, chars: List[Char], weight: Int) extends CodeTree {
  override def toString = "F(" + left.toString + ", " + right.toString + " [" + chars.mkString + ", " + weight + "])"
}
case class Leaf(char: Char, weight: Int) extends CodeTree {
  override def toString = "L(" + char + ", " + weight + ")"
}

object huffman {
  def string2Chars(str: String): List[Char] = str.toList

  def weight(tree: CodeTree): Int = tree match {
    case Leaf(c, w)        => w
    case Fork(l, r, cs, w) => weight(l) + weight(r)
  }
  def chars(tree: CodeTree): List[Char] = tree match {
    case Leaf(c, w)        => List(c)
    case Fork(l, r, cs, w) => chars(l) ::: chars(r)
  }
  def makeCodeTree(left: CodeTree, right: CodeTree) =
    Fork(left, right, chars(left) ::: chars(right), weight(left) + weight(right))

  // count how many times (n) each char (c) is used in chars and return a list of pairs (c, n)
  def times(chars: List[Char]): List[(Char, Int)] = {
    def update(c: Char, list: List[(Char, Int)]): List[(Char, Int)] = list match {
      case List()       => List((c, 1))
      case (x, n) :: xs => if (x == c) (c, n + 1) :: xs else (x, n) :: update(c, xs)
    }
    chars match {
      case List()  => List()
      case c :: cs => update(c, times(cs))
    }
  }
  def makeOrderedLeafList(freqs: List[(Char, Int)]): List[Leaf] =
    freqs.sortWith((s, t) => s._2 < t._2).map(x => Leaf(x._1, x._2))
  def singleton(trees: List[CodeTree]): Boolean = trees.tail.isEmpty

  def combine(trees: List[CodeTree]): List[CodeTree] = trees match {
    case List()         => List()
    case List(a)        => List(a)
    case x1 :: x2 :: xs => insert(makeCodeTree(x1, x2), xs)
  }
  def insert(t: CodeTree, ts: List[CodeTree]): List[CodeTree] = ts match {
    case List()  => List(t)
    case y :: ys => if (weight(t) < weight(y)) t :: ts else y :: insert(t, ys)
  }

  def until(condition: (List[CodeTree]) => Boolean,
            operation: (List[CodeTree]) => List[CodeTree])(trees: List[CodeTree]): List[CodeTree] =
    if (condition(trees)) trees
    else until(condition, operation)(operation(trees))

  def createCodeTree(chars: List[Char]): CodeTree = until(singleton, combine)(makeOrderedLeafList(times(chars))).head

  type Bit = Int
  def decode(tree: CodeTree, bits: List[Bit]): List[Char] = {
    def recurse(subtree: CodeTree, bits: List[Bit], acc: List[Char]): List[Char] = subtree match {
      case Leaf(c, w) => bits match {
        case Nil => c :: acc
        case _ => recurse(tree, bits, c :: acc)
      }
      case Fork(l, r, cs, w) => bits match {
        case Nil     => acc
        case 0 :: bs => recurse(l, bs, acc)
        case 1 :: bs => recurse(r, bs, acc)
        case x :: ba => throw new Error("bit, but not 0 or 1:" + x + "!")
      }
    }
    recurse(tree, bits, List()).reverse
  }

  def encode(tree: CodeTree)(text: List[Char]): List[Bit] = {
    def recurse(subtree: CodeTree, text: List[Char], acc: List[Bit]): List[Bit] = subtree match {
      case Leaf(c, w) => text match {
        case Nil => acc
        case c::cs => recurse(tree, cs, acc)
      }
      case Fork(l, r, cs, w) => text match {
        case Nil     => acc
        case c::_ => if (contains(l, c)) recurse(l, text, 0 :: acc) else recurse(r, text, 1 :: acc)
      }
    }
    recurse(tree, text, List()).reverse
  }
  def contains(tree: CodeTree, ch: Char): Boolean = tree match {
    case Leaf(c, w)        => c == ch
    case Fork(l, r, cs, w) => cs.contains(ch)
  }

  type CodeTable = List[(Char, List[Bit])]
  def codeBits(table: CodeTable)(char: Char): List[Bit] = table match {
    case List()            => List()
    case (c, list) :: rest => if (c == char) list else codeBits(rest)(char)
  }
  def convert(tree: CodeTree): CodeTable = {
    def recurse(tree: CodeTree, acc: CodeTable, bits: List[Bit]): CodeTable = tree match {
      case Leaf(c, w)        => (c, bits.reverse) :: acc
      case Fork(l, r, cs, w) => mergeCodeTables(recurse(l, acc, 0 :: bits), recurse(r, acc, 1 :: bits))
    }
    recurse(tree, List(), List())
  }

  def mergeCodeTables(a: CodeTable, b: CodeTable): CodeTable = a ::: b

  def quickEncode(tree: CodeTree)(text: List[Char]): List[Bit] = {
    val table = convert(tree)
    text.map(ch => codeBits(table)(ch)).flatten
  }

}
