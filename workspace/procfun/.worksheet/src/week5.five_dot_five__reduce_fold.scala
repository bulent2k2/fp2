package week5

object five_dot_five__reduce_fold {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(104); 
  println("Welcome to Reduction (folding) of lists");$skip(69); 

  def sum1(xs: List[Int]) = (0 :: xs) reduceLeft ((x, y) => x + y);System.out.println("""sum1: (xs: List[Int])Int""");$skip(71); 
  def product1(xs: List[Int]) = (1 :: xs) reduceLeft ((x, y) => x * y)

  // syntactic sugar for anonymous functions using _: Each instance of _ is a function parameter from left to right
  type Ints = List[Int];System.out.println("""product1: (xs: List[Int])Int""");$skip(194); 
  def sum2(xs: Ints) = (0 :: xs) reduceLeft (_ + _);System.out.println("""sum2: (xs: week5.five_dot_five__reduce_fold.Ints)Int""");$skip(56); 
  def product2(xs: Ints) = (1 :: xs) reduceLeft (_ * _);System.out.println("""product2: (xs: week5.five_dot_five__reduce_fold.Ints)Int""");$skip(47); 

  def sum(xs: Ints) = (xs foldLeft 0)(_ + _);System.out.println("""sum: (xs: week5.five_dot_five__reduce_fold.Ints)Int""");$skip(49); 
  def product(xs: Ints) = (xs foldLeft 1)(_ * _);System.out.println("""product: (xs: week5.five_dot_five__reduce_fold.Ints)Int""");$skip(39); 

  assert(55 == sum(1.to(10).toList));$skip(41); 
  assert(120 == product(1.to(5).toList));$skip(793); 

  /*
	abstract class List[T] { ...
		// can reduceLeft be defined in terms of reduceLeft??
		
		def reduceLeft(op: (T, T) => T): T = this match {
			case Nil     => throw new Error("Nil.reduceLeft")
			case x :: xs => (xs foldLeft x) op
		}
		def foldLeft[U](unit: U)(op: (U,T)=>U): U = this match {
			case Nil   => unit
			case x::xs => (xs foldLeft op(unit, x))(op)
		}
		
		def reduceRight(op: (T,T) => T): T = this match {
			case Nil      => throw new Error("Nil.reduceRight")
			case x :: Nil => x
			case x :: xs  => op(x, xs.reduceRight(op))
		}
		def foldRight[U](unit: U)(op: (T, U) => U): U = this match {
			case Nil => unit
			case x::xs => op(x, (xs foldRight z)(op))
	  }
	}
	*/

  // AMAZING!!
  def concat[T](xs: List[T], ys: List[T]): List[T] = (xs foldRight ys)(_ :: _);System.out.println("""concat: [T](xs: List[T], ys: List[T])List[T]""");$skip(44); val res$0 = 
  concat(0.to(10).toList, 20.to(25).toList);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(140); val res$1 = 

  /* If op is commutative and associative =>
    Fold left == Fold right functionally (efficiency is another matter) */

  "All is well";System.out.println("""res1: String("All is well") = """ + $show(res$1))}

}
