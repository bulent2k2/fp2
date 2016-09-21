package week2

// This  is from a later week!
object yPatternMatching {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(218); 
	def insert(x: Int, xs: List[Int]): List[Int] = xs match {
		case List() => List(x)
		case y::ys => if (x <= y) x :: xs else y :: insert(x, ys)
	};System.out.println("""insert: (x: Int, xs: List[Int])List[Int]""");$skip(30); val res$0 = 

	insert(1, List(0, 2, 3, 4));System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(33); val res$1 = 
	insert(5, List(0, 3, 5, 8, 10));System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(23); val res$2 = 
	insert(5, List(0, 3));System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(29); 

	// Huffman
	val x = List();System.out.println("""x  : List[Nothing] = """ + $show(x ))}
}
