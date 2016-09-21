package week2

abstract class CodeTree
case class Fork (left: CodeTree, right: CodeTree, chars: List[Char], weight: Int) extends CodeTree
case class Leaf (char: Char, weight: Int) extends CodeTree

// This  is from a later week!
object yPatternMatching {
	def insert(x: Int, xs: List[Int]): List[Int] = xs match {
		case List() => List(x)
		case y::ys => if (x <= y) x :: xs else y :: insert(x, ys)
	}

	insert(1, List(0, 2, 3, 4))
	insert(5, List(0, 3, 5, 8, 10))
	insert(5, List(0, 3))

	// Huffman
	val x = List()
}
