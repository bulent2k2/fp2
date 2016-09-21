package week5

object five_dot_four__higher {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(137); 
  println("Welcome to the Scala worksheet. Lession 5.4 Higher order functions over lists");$skip(164); 

  def scaleList1(xs: List[Double], factor: Double): List[Double] = xs match {
    case Nil     => xs
    case y :: ys => factor * y :: scaleList1(ys, factor)
  }

  type Reals = List[Double];System.out.println("""scaleList1: (xs: List[Double], factor: Double)List[Double]""");$skip(100); 
  def scaleList2(xs: Reals, factor: Double) = xs.map(x => factor * x);System.out.println("""scaleList2: (xs: week5.five_dot_four__higher.Reals, factor: Double)List[Double]""");$skip(147); 
  // _ is explained in the next lecture (5.4). It is called "function expansion"..
  def scaleList(xs: Reals, factor: Double) = xs.map(factor * _);System.out.println("""scaleList: (xs: week5.five_dot_four__higher.Reals, factor: Double)List[Double]""");$skip(74); 

  assert(List(0.0, 3.14, 6.28) == scaleList(List(0.0, 1.0, 2.0), 3.14))

  type Ints = List[Int];$skip(155); 
  def posElems1(xs: Ints): Ints = xs match {
    case Nil      => Nil
    case x :: xs1 => if (x > 0) xs else posElems1(xs1)
  };System.out.println("""posElems1: (xs: week5.five_dot_four__higher.Ints)week5.five_dot_four__higher.Ints""");$skip(44); 
  def posElems(xs: Ints) = xs.filter(_ > 0);System.out.println("""posElems: (xs: week5.five_dot_four__higher.Ints)List[Int]""");$skip(55); 

  assert(posElems(-3.to(3).toList) == List(1, 2, 3));$skip(317); 
  /*
		abstract class List[T] { ...
			def map[U](f: T => U): List[U] = this match {
				case Nil => this
				case x :: xs => f(x) :: xs.map(f)
			}
			//  Note this is not tail recursive. But, the actual definition of map is. It also supports arbitrary collections..
	  }
	*/

  val nums = List(-2, 4, 5, -3, 0, 1);System.out.println("""nums  : List[Int] = """ + $show(nums ));$skip(22); val res$0 = 
  nums filter (_ > 0);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(25); val res$1 = 
  nums filterNot (_ > 0);System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(25); val res$2 = 
  nums partition (_ > 0);System.out.println("""res2: (List[Int], List[Int]) = """ + $show(res$2));$skip(27); val res$3 = 

  nums takeWhile (_ < 5);System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(25); val res$4 = 
  nums dropWhile (_ < 5);System.out.println("""res4: List[Int] = """ + $show(res$4));$skip(20); val res$5 = 
  nums span (_ < 5);System.out.println("""res5: (List[Int], List[Int]) = """ + $show(res$5));$skip(176); 

  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil => Nil
    case x :: xs1 =>
      val (first, rest) = xs span (y => y == x)
      first :: pack(rest)
  };System.out.println("""pack: [T](xs: List[T])List[List[T]]""");$skip(80); 

  val data = List(1, 1, 1, 3, 3, 5, 5, 1, 1, 2, 2, 2, 3, 3, 3, 5, 5, 5, 5, 0);System.out.println("""data  : List[Int] = """ + $show(data ));$skip(13); val res$6 = 
  pack(data);System.out.println("""res6: List[List[Int]] = """ + $show(res$6));$skip(242); 

	// run-length encoding (for compression)
  def encode1[T](xs: List[T]): List[(T, Int)] = xs match {
    case Nil => Nil
    case x :: xs1 =>
      val (first, rest) = xs span (y => y == x)
      (first.head, first.size) :: encode(rest)
  };System.out.println("""encode1: [T](xs: List[T])List[(T, Int)]""");$skip(72); 
  def encode[T](xss: List[T]) = pack(xss).map(xs => (xs.head, xs.size));System.out.println("""encode: [T](xss: List[T])List[(T, Int)]""");$skip(65); val res$7 = 
  
  encode("hello my dear aabbcc anna elsa frozen baba".toList);System.out.println("""res7: List[(Char, Int)] = """ + $show(res$7));$skip(16); val res$8 = 
  "All is well";System.out.println("""res8: String("All is well") = """ + $show(res$8))}
}
