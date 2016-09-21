package week2

object eMapReduce {
 
  def product(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x,y) => x*y, 1)(a, b)
                                                  //> product: (f: Int => Int)(a: Int, b: Int)Int
  
  def sum(a: Int, b: Int): Int = mapReduce(x => x, (x, y) => x + y, 0)(a, b)
                                                  //> sum: (a: Int, b: Int)Int
  
  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, init: Int)(a: Int, b: Int): Int =
  	if (a > b) init
  	else combine(f(a), mapReduce(f, combine, init)(a+1, b))
                                                  //> mapReduce: (f: Int => Int, combine: (Int, Int) => Int, init: Int)(a: Int, b:
                                                  //|  Int)Int

  val t1 = product(x => x)(1, 10)                 //> t1  : Int = 3628800
  val t2 = sum(1, 100)                            //> t2  : Int = 5050
  
}