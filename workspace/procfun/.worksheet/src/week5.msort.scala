package week5

object msort {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(74); 
  println("Welcome to the Scala worksheet")

  type ML = List[Int];$skip(424); 
  def msort(xs: ML): ML = {
    val n = xs.length / 2
    if (n == 0) xs
    else {
      def merge(xs: ML, ys: ML): ML = (xs, ys) match {
        case (Nil, _) => ys
        case (_, Nil) => xs
        case (x :: xs1, y :: ys1) =>
          if (x < y) x :: merge(xs1, ys)
          else y :: merge(xs, ys1)
      }

      val (fst, snd) = xs splitAt n
      merge(msort(fst), msort(snd))
    }
  };System.out.println("""msort: (xs: week5.msort.ML)week5.msort.ML""");$skip(84); 

  assert(msort(List(1, 3, 5, 4, 2, 9, -1, 15)) == List(-1, 1, 2, 3, 4, 5, 9, 15));$skip(16); val res$0 = 
  "here we are";System.out.println("""res0: String("here we are") = """ + $show(res$0));$skip(248); 

  def mergeFirstRev(xs: ML, ys: ML): ML = xs match {
    case Nil => ys
    case x :: xs1 => ys match {
      case Nil => xs
      case y :: ys1 =>
        if (x < y) x :: mergeFirstRev(xs1, ys)
        else y :: mergeFirstRev(xs, ys1)
    }
  };System.out.println("""mergeFirstRev: (xs: week5.msort.ML, ys: week5.msort.ML)week5.msort.ML""")}
