package week5

object msort_parameterized {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
 
 	type F[T] = (T, T) => Boolean
  def msort[T](xs: List[T])(lt: F[T]): List[T] = {
    val n = xs.length / 2
    if (n == 0) xs
    else {
      def merge(xs: List[T], ys: List[T]): List[T] = (xs, ys) match {
        case (Nil, _) => ys
        case (_, Nil) => xs
        case (x :: xs1, y :: ys1) =>
          if (lt(x,y)) x :: merge(xs1, ys)
          else y :: merge(xs, ys1)
      }

      val (fst, snd) = xs splitAt n
      merge(msort(fst)(lt), msort(snd)(lt))
    }
  }                                               //> msort: [T](xs: List[T])(lt: week5.msort_parameterized.F[T])List[T]

	// type inference (of the lambda) based on not the body of the function (that's in haskell :-),
	// but on the type of the values passed to the first arg of msort
  assert(msort(List(1, 3, 5, 4, 2, 9, -1, 15))((s,t) => s < t) == List(-1, 1, 2, 3, 4, 5, 9, 15))
  "here we are"                                   //> res0: String("here we are") = here we are
  
  msort(List("apple", "pineapple", "banana", "strawberry", "orange"))((x,y) => x.compareTo(y) < 0)
                                                  //> res1: List[String] = List(apple, banana, orange, pineapple, strawberry)
}