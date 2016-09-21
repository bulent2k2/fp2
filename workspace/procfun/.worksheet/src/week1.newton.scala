package week1

object newton {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(37); val res$0 = 
	1 + 3;System.out.println("""res0: Int(4) = """ + $show(res$0));$skip(43); 
	def abs(x: Double) = if (x < 0) -x else x;System.out.println("""abs: (x: Double)Double""");$skip(53); 
	def min(x: Double, y: Double) = if (x < y) x else y;System.out.println("""min: (x: Double, y: Double)Double""");$skip(126); 
	
	def sqrtIter(guess: Double, x: Double): Double =
		if (isGoodEnough(guess, x)) guess
		else sqrtIter(improve(guess, x), x);System.out.println("""sqrtIter: (guess: Double, x: Double)Double""");$skip(87); 
		
	def isGoodEnough(guess: Double, x: Double) =
		abs(guess * guess - x) / x < 0.0001;System.out.println("""isGoodEnough: (guess: Double, x: Double)Boolean""");$skip(71); 
		
	def improve(guess: Double, x: Double) =
		(guess + x / guess) / 2;System.out.println("""improve: (guess: Double, x: Double)Double""");$skip(41); 
		
	def sqrt(x: Double) = sqrtIter(1, x);System.out.println("""sqrt: (x: Double)Double""");$skip(11); val res$1 = 
	
	sqrt(4);System.out.println("""res1: Double = """ + $show(res$1));$skip(10); val res$2 = 
	sqrt(25);System.out.println("""res2: Double = """ + $show(res$2));$skip(9); val res$3 = 
	sqrt(2);System.out.println("""res3: Double = """ + $show(res$3));$skip(11); val res$4 = 
	sqrt(100);System.out.println("""res4: Double = """ + $show(res$4));$skip(13); val res$5 = 
	sqrt(0.001);System.out.println("""res5: Double = """ + $show(res$5));$skip(13); val res$6 = 
	sqrt(10000);System.out.println("""res6: Double = """ + $show(res$6));$skip(15); val res$7 = 
	sqrt(0.00001);System.out.println("""res7: Double = """ + $show(res$7));$skip(16); val res$8 = 
	"Hello, World";System.out.println("""res8: String("Hello, World") = """ + $show(res$8));$skip(12); val res$9 = 
	"Problems";System.out.println("""res9: String("Problems") = """ + $show(res$9));$skip(173); val res$10 = 
	// without normalization (dividing by x), we get problems:
	// very small numbers don't get accurate results.
	// e.g., sqrt(1e-10) -> 1e-5, but we get 7.8e-3
	sqrt(1e-10);System.out.println("""res10: Double = """ + $show(res$10));$skip(69); val res$11 = 
	// very large numbers cause bottom (does not terminate)
	sqrt(1e60);System.out.println("""res11: Double = """ + $show(res$11))}
}
