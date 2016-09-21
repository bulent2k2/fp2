package week2

object aLower {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def sumInts(a: Int, b: Int): Int =
    if (a > b) 0 else a + sumInts(a + 1, b)       //> sumInts: (a: Int, b: Int)Int

  val x = sumInts(1, 100)                         //> x  : Int = 5050

  def sumCubes(a: Int, b: Int): Int = {
    def cube(x: Int) = x * x * x
    if (a > b) 0 else cube(a) + sumCubes(a + 1, b)
  }                                               //> sumCubes: (a: Int, b: Int)Int

  val y = sumCubes(1, 3)                          //> y  : Int = 36

  def fact(x: Int): Int = if (x == 0) 1 else x * fact(x - 1)
                                                  //> fact: (x: Int)Int

  def sumFactorials(a: Int, b: Int): Int = {
    if (a > b) 0 else fact(a) + sumFactorials(a + 1, b)
  }                                               //> sumFactorials: (a: Int, b: Int)Int

  val z = sumFactorials(1, 4)                     //> z  : Int = 33

}