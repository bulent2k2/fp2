package week5

object msort_param3 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(80); 
  println("Welcome to the Scala worksheet");$skip(466); 
  
  
  def msort[T](xs: List[T])(implicit ord: Ordering[T]): List[T] = {
    val n = xs.length / 2
    if (n == 0) xs
    else {
      def merge(xs: List[T], ys: List[T]): List[T] = (xs, ys) match {
        case (Nil, _) => ys
        case (_, Nil) => xs
        case (x :: xs1, y :: ys1) =>
          if (ord.lt(x,y)) x :: merge(xs1, ys)
          else y :: merge(xs, ys1)
      }

      val (fst, snd) = xs splitAt n
      merge(msort(fst), msort(snd))
    }
  };System.out.println("""msort: [T](xs: List[T])(implicit ord: Ordering[T])List[T]""");$skip(247); 

	// type inference (of the lambda) based on not the body of the function (that's in haskell :-),
	// but on the type of the values passed to the first arg of msort
  assert(msort(List(1, 3, 5, 4, 2, 9, -1, 15)) == List(-1, 1, 2, 3, 4, 5, 9, 15));$skip(16); val res$0 = 
  "here we are";System.out.println("""res0: String("here we are") = """ + $show(res$0));$skip(73); val res$1 = 
  
  msort(List("apple", "pineapple", "banana", "strawberry", "orange"));System.out.println("""res1: List[String] = """ + $show(res$1))}
                                                  
                                                  
}
