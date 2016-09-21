package week5

object lists {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(74); 
  println("Welcome to the Scala worksheet");$skip(158); 

  def last[T](xs: List[T]): T = xs match {
    case List()  => throw new Error("last of empty list")
    case List(a) => a
    case x :: xs => last(xs)
  };System.out.println("""last: [T](xs: List[T])T""");$skip(174); 

  def init[T](xs: List[T]): List[T] = xs match {
    case List()  => throw new Error("init of empty list")
    case List(a) => List()
    case x :: xs => x :: init(xs)
  };System.out.println("""init: [T](xs: List[T])List[T]""");$skip(265); 

  // PS: xs ::: ys is a method call on ys! Any method with name ending (or starting) in : binds to the right
  // There is also ++!
  def concat[T](xs: List[T], ys: List[T]): List[T] = xs match {
    case List()  => ys
    case x :: xs => x :: concat(xs, ys)
  };System.out.println("""concat: [T](xs: List[T], ys: List[T])List[T]""");$skip(147); 

  // THIS IS n*n
  def reverse[T](xs: List[T]): List[T] = xs match {
    case List()  => xs
    case x :: xs => concat(reverse(xs), List(x))
  };System.out.println("""reverse: [T](xs: List[T])List[T]""");$skip(155); 

  def removeAt[T](xs: List[T], n: Int): List[T] = xs match {
    case List()  => xs
    case x :: xs => if (n == 0) xs else x :: removeAt(xs, n - 1)
  };System.out.println("""removeAt: [T](xs: List[T], n: Int)List[T]""");$skip(76); 

  def removeAt2[T](n: Int, xs: List[T]) = (xs take n) ::: (xs drop n + 1);System.out.println("""removeAt2: [T](n: Int, xs: List[T])List[T]""");$skip(82); val res$0 = 

  // works :-). But, too bad, it takes Order(n)!
  removeAt(1.to(5).toList, -1);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(43); val res$1 = 
  
  removeAt2(2, List(0, 1, 2, 3, 4, 5));System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(35); 

  val list = List(1, 2, 3, 4, 5);System.out.println("""list  : List[Int] = """ + $show(list ));$skip(34); 
  assert(last(list) == list.last);$skip(41); 
  assert(List(1, 2, 3, 4) == init(list));$skip(34); 
  assert(List() == init(List(1)));$skip(29); 
  assert(2 == last(List(2)));$skip(30); 

  val l2 = List(9, 8, 7, 6);System.out.println("""l2  : List[Int] = """ + $show(l2 ));$skip(62); 
  assert(concat(list, l2) == List(1, 2, 3, 4, 5, 9, 8, 7, 6));$skip(63); 

  assert(concat(l2, list.reverse).reverse == 1.to(9).toList);$skip(16); val res$2 = 

  list ::: l2;System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(40); 

  assert(init(List()) == List().init)}

}
