package week2

object cSumTailRec {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def fact(a: Int): Int = {
  	def loop(x: Int, acc: Int): Int = if (x == 0) acc else loop(x - 1, x * acc)
  	loop(a, 1)
  	
  }                                               //> fact: (a: Int)Int
  
  def sum(f: Int => Int, a: Int, b: Int): Int = {
  	def loop(x: Int, acc: Int): Int = if (x > b) acc else loop(x + 1, f(x) + acc)
  	loop(a, 0)
  }                                               //> sum: (f: Int => Int, a: Int, b: Int)Int
  
  val t1 = sum(x => x, 1, 100)                    //> t1  : Int = 5050
  val t2 = sum(x => x*x*x, 1, 3)                  //> t2  : Int = 36
  val t3 = sum(fact, 1, 4)                        //> t3  : Int = 33
  
}