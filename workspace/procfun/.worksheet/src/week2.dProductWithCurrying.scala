package week2

object dProductWithCurrying {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(89); 
  println("Welcome to the Scala worksheet");$skip(108); 

  def product(f: Int => Int)(a: Int, b: Int): Int =
    if (a > b) 1
    else f(a) * product(f)(a + 1, b);System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(35); 

  val x = product(x => x)(1, 10);System.out.println("""x  : Int = """ + $show(x ));$skip(34); 
	val y = product(x => x+2)(8, 10);System.out.println("""y  : Int = """ + $show(y ));$skip(44); 
	
	def fact(a: Int) = product(x => x)(1, a);System.out.println("""fact: (a: Int)Int""");$skip(20); 
	
	val z = fact(10);System.out.println("""z  : Int = """ + $show(z ))}
	
}
