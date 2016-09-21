package week5

object five_dot_four__higher {
  println("Welcome to the Scala worksheet. Lession 5.4 Higher order functions over lists")
                                                  //> Welcome to the Scala worksheet. Lession 5.4 Higher order functions over list
                                                  //| s

  def scaleList1(xs: List[Double], factor: Double): List[Double] = xs match {
    case Nil     => xs
    case y :: ys => factor * y :: scaleList1(ys, factor)
  }                                               //> scaleList1: (xs: List[Double], factor: Double)List[Double]

  type Reals = List[Double]
  def scaleList2(xs: Reals, factor: Double) = xs.map(x => factor * x)
                                                  //> scaleList2: (xs: week5.five_dot_four__higher.Reals, factor: Double)List[Doub
                                                  //| le]
  // _ is explained in the next lecture (5.4). It is called "function expansion"..
  def scaleList(xs: Reals, factor: Double) = xs.map(factor * _)
                                                  //> scaleList: (xs: week5.five_dot_four__higher.Reals, factor: Double)List[Doubl
                                                  //| e]

  assert(List(0.0, 3.14, 6.28) == scaleList(List(0.0, 1.0, 2.0), 3.14))

  type Ints = List[Int]
  def posElems1(xs: Ints): Ints = xs match {
    case Nil      => Nil
    case x :: xs1 => if (x > 0) xs else posElems1(xs1)
  }                                               //> posElems1: (xs: week5.five_dot_four__higher.Ints)week5.five_dot_four__higher
                                                  //| .Ints
  def posElems(xs: Ints) = xs.filter(_ > 0)       //> posElems: (xs: week5.five_dot_four__higher.Ints)List[Int]

  assert(posElems(-3.to(3).toList) == List(1, 2, 3))
  /*
		abstract class List[T] { ...
			def map[U](f: T => U): List[U] = this match {
				case Nil => this
				case x :: xs => f(x) :: xs.map(f)
			}
			//  Note this is not tail recursive. But, the actual definition of map is. It also supports arbitrary collections..
	  }
	*/

  val nums = List(-2, 4, 5, -3, 0, 1)             //> nums  : List[Int] = List(-2, 4, 5, -3, 0, 1)
  nums filter (_ > 0)                             //> res0: List[Int] = List(4, 5, 1)
  nums filterNot (_ > 0)                          //> res1: List[Int] = List(-2, -3, 0)
  nums partition (_ > 0)                          //> res2: (List[Int], List[Int]) = (List(4, 5, 1),List(-2, -3, 0))

  nums takeWhile (_ < 5)                          //> res3: List[Int] = List(-2, 4)
  nums dropWhile (_ < 5)                          //> res4: List[Int] = List(5, -3, 0, 1)
  nums span (_ < 5)                               //> res5: (List[Int], List[Int]) = (List(-2, 4),List(5, -3, 0, 1))

  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil => Nil
    case x :: xs1 =>
      val (first, rest) = xs span (y => y == x)
      first :: pack(rest)
  }                                               //> pack: [T](xs: List[T])List[List[T]]

  val data = List(1, 1, 1, 3, 3, 5, 5, 1, 1, 2, 2, 2, 3, 3, 3, 5, 5, 5, 5, 0)
                                                  //> data  : List[Int] = List(1, 1, 1, 3, 3, 5, 5, 1, 1, 2, 2, 2, 3, 3, 3, 5, 5,
                                                  //|  5, 5, 0)
  pack(data)                                      //> res6: List[List[Int]] = List(List(1, 1, 1), List(3, 3), List(5, 5), List(1,
                                                  //|  1), List(2, 2, 2), List(3, 3, 3), List(5, 5, 5, 5), List(0))

	// run-length encoding (for compression)
  def encode1[T](xs: List[T]): List[(T, Int)] = xs match {
    case Nil => Nil
    case x :: xs1 =>
      val (first, rest) = xs span (y => y == x)
      (first.head, first.size) :: encode(rest)
  }                                               //> encode1: [T](xs: List[T])List[(T, Int)]
  def encode[T](xss: List[T]) = pack(xss).map(xs => (xs.head, xs.size))
                                                  //> encode: [T](xss: List[T])List[(T, Int)]
  
  encode("hello my dear aabbcc anna elsa frozen baba".toList)
                                                  //> res7: List[(Char, Int)] = List((h,1), (e,1), (l,2), (o,1), ( ,1), (m,1), (y
                                                  //| ,1), ( ,1), (d,1), (e,1), (a,1), (r,1), ( ,1), (a,2), (b,2), (c,2), ( ,1), 
                                                  //| (a,1), (n,2), (a,1), ( ,1), (e,1), (l,1), (s,1), (a,1), ( ,1), (f,1), (r,1)
                                                  //| , (o,1), (z,1), (e,1), (n,1), ( ,1), (b,1), (a,1), (b,1), (a,1))
  "All is well"                                   //> res8: String("All is well") = All is well
}