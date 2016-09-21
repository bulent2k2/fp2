package week5

object lists {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def last[T](xs: List[T]): T = xs match {
    case List()  => throw new Error("last of empty list")
    case List(a) => a
    case x :: xs => last(xs)
  }                                               //> last: [T](xs: List[T])T

  def init[T](xs: List[T]): List[T] = xs match {
    case List()  => throw new Error("init of empty list")
    case List(a) => List()
    case x :: xs => x :: init(xs)
  }                                               //> init: [T](xs: List[T])List[T]

  // PS: xs ::: ys is a method call on ys! Any method with name ending (or starting) in : binds to the right
  // There is also ++!
  def concat[T](xs: List[T], ys: List[T]): List[T] = xs match {
    case List()  => ys
    case x :: xs => x :: concat(xs, ys)
  }                                               //> concat: [T](xs: List[T], ys: List[T])List[T]

  // THIS IS n*n
  def reverse[T](xs: List[T]): List[T] = xs match {
    case List()  => xs
    case x :: xs => concat(reverse(xs), List(x))
  }                                               //> reverse: [T](xs: List[T])List[T]

  def removeAt[T](xs: List[T], n: Int): List[T] = xs match {
    case List()  => xs
    case x :: xs => if (n == 0) xs else x :: removeAt(xs, n - 1)
  }                                               //> removeAt: [T](xs: List[T], n: Int)List[T]

  def removeAt2[T](n: Int, xs: List[T]) = (xs take n) ::: (xs drop n + 1)
                                                  //> removeAt2: [T](n: Int, xs: List[T])List[T]

  // works :-). But, too bad, it takes Order(n)!
  removeAt(1.to(5).toList, -1)                    //> res0: List[Int] = List(1, 2, 3, 4, 5)
  
  removeAt2(2, List(0, 1, 2, 3, 4, 5))            //> res1: List[Int] = List(0, 1, 3, 4, 5)

  val list = List(1, 2, 3, 4, 5)                  //> list  : List[Int] = List(1, 2, 3, 4, 5)
  assert(last(list) == list.last)
  assert(List(1, 2, 3, 4) == init(list))
  assert(List() == init(List(1)))
  assert(2 == last(List(2)))

  val l2 = List(9, 8, 7, 6)                       //> l2  : List[Int] = List(9, 8, 7, 6)
  assert(concat(list, l2) == List(1, 2, 3, 4, 5, 9, 8, 7, 6))

  assert(concat(l2, list.reverse).reverse == 1.to(9).toList)

  list ::: l2                                     //> res2: List[Int] = List(1, 2, 3, 4, 5, 9, 8, 7, 6)

  assert(init(List()) == List().init)             //> java.lang.Error: init of empty list
                                                  //| 	at week5.lists$$anonfun$main$1.init$1(week5.lists.scala:13)
                                                  //| 	at week5.lists$$anonfun$main$1.apply$mcV$sp(week5.lists.scala:56)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at week5.lists$.main(week5.lists.scala:3)
                                                  //| 	at week5.lists.main(week5.lists.scala)

}