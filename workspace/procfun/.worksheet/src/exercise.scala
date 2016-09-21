import week2.Rational

import week3._

object exercise {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(101); 
  println("Welcome to the Scala worksheet");$skip(22); val res$0 = 
  new Rational(7, 49);System.out.println("""res0: week2.Rational = """ + $show(res$0));$skip(50); 

  def error(msg: String) = throw new Error(msg);System.out.println("""error: (msg: String)Nothing""");$skip(17); 

  val x = null;System.out.println("""x  : Null = """ + $show(x ));$skip(20); 
  val y: String = x;System.out.println("""y  : String = """ + $show(y ));$skip(27); val res$1 = 

  if (true) 1 else false;System.out.println("""res1: AnyVal = """ + $show(res$1));$skip(25); 

  val z: Any = "Hello";System.out.println("""z  : Any = """ + $show(z ));$skip(45); 

  def f(x: Int): (Int => Int) = a => x * a;System.out.println("""f: (x: Int)Int => Int""");$skip(7); val res$2 = 
  f(3);System.out.println("""res2: Int => Int = """ + $show(res$2));$skip(10); val res$3 = 
  f(3)(5);System.out.println("""res3: Int = """ + $show(res$3));$skip(17); val res$4 = 

	Empty == Empty;System.out.println("""res4: Boolean = """ + $show(res$4));$skip(36); val res$5 = 
	new Rational(1) == new Rational(1);System.out.println("""res5: Boolean = """ + $show(res$5));$skip(26); 
	var r1 = new Rational(1);System.out.println("""r1  : week2.Rational = """ + $show(r1 ));$skip(26); 
	var r2 = new Rational(1);System.out.println("""r2  : week2.Rational = """ + $show(r2 ));$skip(28); val res$6 = 
	r1.toString == r2.toString;System.out.println("""res6: Boolean = """ + $show(res$6));$skip(26); val res$7 = 
	new Rational(1).toString;System.out.println("""res7: String = """ + $show(res$7));$skip(26); val res$8 = 
	
  error("Just testing");System.out.println("""res8: Nothing = """ + $show(res$8))}
                                                  
}
