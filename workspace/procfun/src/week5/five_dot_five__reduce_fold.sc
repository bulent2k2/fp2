package week5

object five_dot_five__reduce_fold {
  println("Welcome to Reduction (folding) of lists")
                                                  //> Welcome to Reduction (folding) of lists

  def sum1(xs: List[Int]) = (0 :: xs) reduceLeft ((x, y) => x + y)
                                                  //> sum1: (xs: List[Int])Int
  def product1(xs: List[Int]) = (1 :: xs) reduceLeft ((x, y) => x * y)
                                                  //> product1: (xs: List[Int])Int

  // syntactic sugar for anonymous functions using _: Each instance of _ is a function parameter from left to right
  type Ints = List[Int]
  def sum2(xs: Ints) = (0 :: xs) reduceLeft (_ + _)
                                                  //> sum2: (xs: week5.five_dot_five__reduce_fold.Ints)Int
  def product2(xs: Ints) = (1 :: xs) reduceLeft (_ * _)
                                                  //> product2: (xs: week5.five_dot_five__reduce_fold.Ints)Int

  def sum(xs: Ints) = (xs foldLeft 0)(_ + _)      //> sum: (xs: week5.five_dot_five__reduce_fold.Ints)Int
  def product(xs: Ints) = (xs foldLeft 1)(_ * _)  //> product: (xs: week5.five_dot_five__reduce_fold.Ints)Int

  assert(55 == sum(1.to(10).toList))
  assert(120 == product(1.to(5).toList))

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
  def concat[T](xs: List[T], ys: List[T]): List[T] = (xs foldRight ys)(_ :: _)
                                                  //> concat: [T](xs: List[T], ys: List[T])List[T]
  concat(0.to(10).toList, 20.to(25).toList)       //> res0: List[Int] = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 21, 22, 23, 24
                                                  //| , 25)

  /* If op is commutative and associative =>
    Fold left == Fold right functionally (efficiency is another matter) */

  "All is well"                                   //> res1: String("All is well") = All is well

}