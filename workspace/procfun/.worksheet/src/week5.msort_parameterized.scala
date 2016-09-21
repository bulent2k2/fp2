package week5

object msort_parameterized {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(87); 
  println("Welcome to the Scala worksheet")
 
 	type F[T] = (T, T) => Boolean;$skip(481); 
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
  };System.out.println("""msort: [T](xs: List[T])(lt: week5.msort_parameterized.F[T])List[T]""");$skip(263); 

	// type inference (of the lambda) based on not the body of the function (that's in haskell :-),
	// but on the type of the values passed to the first arg of msort
  assert(msort(List(1, 3, 5, 4, 2, 9, -1, 15))((s,t) => s < t) == List(-1, 1, 2, 3, 4, 5, 9, 15));$skip(16); val res$0 = 
  "here we are";System.out.println("""res0: String("here we are") = """ + $show(res$0));$skip(102); val res$1 = 
  
  msort(List("apple", "pineapple", "banana", "strawberry", "orange"))((x,y) => x.compareTo(y) < 0);System.out.println("""res1: List[String] = """ + $show(res$1))}
}
