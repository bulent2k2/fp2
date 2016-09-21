package week4

object lambda {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  (x: Int) => x * x                               //> res0: Int => Int = <function1>

  {
    class AnonFun extends Function1[Int, Int] {
      def apply(x: Int): Int = x * x
    }
    new AnonFun
  }                                               //> res1: AnonFun = <function1>

}