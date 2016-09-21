package week2

object cSumTailRec {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(79); 
  println("Welcome to the Scala worksheet");$skip(132); 
  
  def fact(a: Int): Int = {
  	def loop(x: Int, acc: Int): Int = if (x == 0) acc else loop(x - 1, x * acc)
  	loop(a, 1)
  	
  };System.out.println("""fact: (a: Int)Int""");$skip(152); 
  
  def sum(f: Int => Int, a: Int, b: Int): Int = {
  	def loop(x: Int, acc: Int): Int = if (x > b) acc else loop(x + 1, f(x) + acc)
  	loop(a, 0)
  };System.out.println("""sum: (f: Int => Int, a: Int, b: Int)Int""");$skip(34); 
  
  val t1 = sum(x => x, 1, 100);System.out.println("""t1  : Int = """ + $show(t1 ));$skip(33); 
  val t2 = sum(x => x*x*x, 1, 3);System.out.println("""t2  : Int = """ + $show(t2 ));$skip(27); 
  val t3 = sum(fact, 1, 4);System.out.println("""t3  : Int = """ + $show(t3 ))}
  
}
