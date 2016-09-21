package week2

object dProductWithCurrying {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def product(f: Int => Int)(a: Int, b: Int): Int =
    if (a > b) 1
    else f(a) * product(f)(a + 1, b)              //> product: (f: Int => Int)(a: Int, b: Int)Int

  val x = product(x => x)(1, 10)                  //> x  : Int = 3628800
	val y = product(x => x+2)(8, 10)          //> y  : Int = 1320
	
	def fact(a: Int) = product(x => x)(1, a)  //> fact: (a: Int)Int
	
	val z = fact(10)                          //> z  : Int = 3628800
	
}