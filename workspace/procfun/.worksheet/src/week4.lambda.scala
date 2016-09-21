package week4

object lambda {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(75); 
  println("Welcome to the Scala worksheet");$skip(22); val res$0 = 

  (x: Int) => x * x;System.out.println("""res0: Int => Int = """ + $show(res$0));$skip(117); val res$1 = 

  {
    class AnonFun extends Function1[Int, Int] {
      def apply(x: Int): Int = x * x
    }
    new AnonFun
  };System.out.println("""res1: AnonFun = """ + $show(res$1))}

}
