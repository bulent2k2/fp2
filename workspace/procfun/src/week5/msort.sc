package week5

object msort {
  println("Welcome to the Scala worksheet")

  type ML = List[Int]
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
  }

  assert(msort(List(1, 3, 5, 4, 2, 9, -1, 15)) == List(-1, 1, 2, 3, 4, 5, 9, 15))
  "here we are"

  def mergeFirstRev(xs: ML, ys: ML): ML = xs match {
    case Nil => ys
    case x :: xs1 => ys match {
      case Nil => xs
      case y :: ys1 =>
        if (x < y) x :: mergeFirstRev(xs1, ys)
        else y :: mergeFirstRev(xs, ys1)
    }
  }