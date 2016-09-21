package week2

object bHigh {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(74); 
  println("Welcome to the Scala worksheet");$skip(100); 

  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0
    else f(a) + sum(f, a + 1, b);System.out.println("""sum: (f: Int => Int, a: Int, b: Int)Int""");$skip(32); 

  val a = sum(x => x, 1, 100);System.out.println("""a  : Int = """ + $show(a ));$skip(36); 
  val b = sum(x => x * x * x, 1, 3);System.out.println("""b  : Int = """ + $show(b ));$skip(61); 
  def fact(x: Int): Int = if (x == 0) 1 else x * fact(x - 1);System.out.println("""fact: (x: Int)Int""");$skip(36); 

  val c = sum(x => fact(x), 1, 4);System.out.println("""c  : Int = """ + $show(c ))}

	
}
