package week2

object eMapReduce {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(124); 
 
  def product(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x,y) => x*y, 1)(a, b);System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(80); 
  
  def sum(a: Int, b: Int): Int = mapReduce(x => x, (x, y) => x + y, 0)(a, b);System.out.println("""sum: (a: Int, b: Int)Int""");$skip(174); 
  
  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, init: Int)(a: Int, b: Int): Int =
  	if (a > b) init
  	else combine(f(a), mapReduce(f, combine, init)(a+1, b));System.out.println("""mapReduce: (f: Int => Int, combine: (Int, Int) => Int, init: Int)(a: Int, b: Int)Int""");$skip(35); 

  val t1 = product(x => x)(1, 10);System.out.println("""t1  : Int = """ + $show(t1 ));$skip(23); 
  val t2 = sum(1, 100);System.out.println("""t2  : Int = """ + $show(t2 ))}
  
}
