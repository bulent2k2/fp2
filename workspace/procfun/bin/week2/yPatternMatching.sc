package week2

// This  is from a later week!
object yPatternMatching {
	def insert(x: Int, xs: List[Int]): List[Int] = xs match {
		case List() => List(x)
		case y::ys => if (x <= y) x :: xs else y :: insert(x, ys)
	}                                         //> insert: (x: Int, xs: List[Int])List[Int]

	insert(1, List(0, 2, 3, 4))               //> res0: List[Int] = List(0, 1, 2, 3, 4)
	insert(5, List(0, 3, 5, 8, 10))           //> res1: List[Int] = List(0, 3, 5, 5, 8, 10)
	insert(5, List(0, 3))                     //> res2: List[Int] = List(0, 3, 5)

	// Huffman
	val x = List()                            //> x  : List[Nothing] = List()
}