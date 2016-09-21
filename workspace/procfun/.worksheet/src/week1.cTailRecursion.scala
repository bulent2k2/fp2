package week1

object cTailRecursion {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(118); 
  println("Tail recursion gets us the loop behavior in imperative programming");$skip(98); 
  
  // @tailrec
  def gcd(x: Integer, y: Integer): Integer =
  	if (y == 0) x else gcd(y, x % y);System.out.println("""gcd: (x: Integer, y: Integer)Integer""");$skip(17); val res$0 = 
  	
  gcd(10,5);System.out.println("""res0: Integer = """ + $show(res$0));$skip(11); val res$1 = 
  gcd(3,7);System.out.println("""res1: Integer = """ + $show(res$1));$skip(11); val res$2 = 
  gcd(5,0);System.out.println("""res2: Integer = """ + $show(res$2));$skip(13); val res$3 = 
  gcd(15,21);System.out.println("""res3: Integer = """ + $show(res$3));$skip(15); val res$4 = 
  gcd(120,600);System.out.println("""res4: Integer = """ + $show(res$4));$skip(83); 
  
  def factorial(n: Integer): Integer =
  	if (n == 0) 1 else n * factorial(n-1);System.out.println("""factorial: (n: Integer)Integer""");$skip(19); val res$5 = 
  	
  factorial(5);System.out.println("""res5: Integer = """ + $show(res$5));$skip(16); val res$6 = 
  factorial(20);System.out.println("""res6: Integer = """ + $show(res$6));$skip(16); val res$7 = 
  factorial(15);System.out.println("""res7: Integer = """ + $show(res$7));$skip(214); 

	// lets make it tail recursive so that we don't have to use more than one stack frame
	def fact2(n: Int): Int = {
		def loop(acc: Int, n: Int): Int =
			if (n == 0) acc
			else loop(acc * n, n-1)
		loop(1, n)
	};System.out.println("""fact2: (n: Int)Int""");$skip(13); val res$8 = 
	
	fact2(15);System.out.println("""res8: Int = """ + $show(res$8));$skip(12); val res$9 = 
  fact2(20);System.out.println("""res9: Int = """ + $show(res$9))}
  
}
