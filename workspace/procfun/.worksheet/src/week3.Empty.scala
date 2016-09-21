package week3

abstract class IntSet {
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean
  def union(that: IntSet): IntSet
}

class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
  override def toString = "{" + left.toString + elem + right.toString + "}"
  def incl(x: Int): IntSet =
    if (this contains x) this
    else if (x < elem) new NonEmpty(elem, left incl x, right)
    else new NonEmpty(elem, left, right incl x)

  def contains(x: Int): Boolean =
    if (x == elem) true
    else if (x < elem) left contains x
    else right contains x

  def union(that: IntSet): IntSet =
    // how beautiful is this recursion!!
    ((left union right) union that) incl elem

}

object Empty extends IntSet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(778); 
  def contains(x: Int): Boolean = false;System.out.println("""contains: (x: Int)Boolean""");$skip(59); 
  def incl(x: Int): IntSet = new NonEmpty(x, Empty, Empty);System.out.println("""incl: (x: Int)week3.IntSet""");$skip(38); 
  override def toString: String = ".";System.out.println("""toString: ()String""");$skip(41); 
  def union(that: IntSet): IntSet = that;System.out.println("""union: (that: week3.IntSet)week3.IntSet""")}
}

object aIntSetClass {

  val s4 = Empty incl 4 incl 6
  val u4 = s4 union s4

  val x = new NonEmpty(5, new NonEmpty(3, Empty, Empty), Empty)
  val s2 = x incl 4
  val s3 = s2 incl 7
  val b1 = s3 contains 5
  val b2 = s3 contains 3
  val b3 = s3 contains 7
  val b4 = s3 contains 20
  val b5 = s3 contains -10

  val u1 = s4 union s3
  val u2 = s3 union s4
  val u3 = s3 union s3

  val b6 = s3 == (s3 union s3)

  def main(args: Array[String]) = {
    println("hello world!")
    println(x)
  }

}
