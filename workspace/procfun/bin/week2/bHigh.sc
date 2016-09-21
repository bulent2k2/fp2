package week2

object bHigh {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0
    else f(a) + sum(f, a + 1, b)                  //> sum: (f: Int => Int, a: Int, b: Int)Int

  val a = sum(x => x, 1, 100)                     //> a  : Int = 5050
  val b = sum(x => x * x * x, 1, 3)               //> b  : Int = 36
  def fact(x: Int): Int = if (x == 0) 1 else x * fact(x - 1)
                                                  //> fact: (x: Int)Int

  val c = sum(x => fact(x), 1, 4)                 //> c  : Int = 33

	
}