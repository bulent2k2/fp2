package week1

object aSqrtClean {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(78); 

	def abs(x: Double) = if (x < 0) -x else x;System.out.println("""abs: (x: Double)Double""");$skip(296); 

	def sqrt(x: Double) = {
		def sqrtIter(guess: Double): Double =
			if (isGoodEnough(guess)) guess
			else sqrtIter(improve(guess))
			
		def isGoodEnough(guess: Double) =
			abs(guess * guess - x) / x < 0.0001
			
		def improve(guess: Double) =
			(guess + x / guess) / 2
			
		sqrtIter(1)
	};System.out.println("""sqrt: (x: Double)Double""");$skip(11); val res$0 = 
	
	sqrt(4);System.out.println("""res0: Double = """ + $show(res$0));$skip(10); val res$1 = 
	sqrt(25);System.out.println("""res1: Double = """ + $show(res$1));$skip(9); val res$2 = 
	sqrt(2);System.out.println("""res2: Double = """ + $show(res$2));$skip(11); val res$3 = 
	sqrt(100);System.out.println("""res3: Double = """ + $show(res$3));$skip(13); val res$4 = 
	sqrt(0.001);System.out.println("""res4: Double = """ + $show(res$4));$skip(13); val res$5 = 
	sqrt(10000);System.out.println("""res5: Double = """ + $show(res$5));$skip(15); val res$6 = 
	sqrt(0.00001);System.out.println("""res6: Double = """ + $show(res$6));$skip(16); val res$7 = 
	"Hello, World";System.out.println("""res7: String("Hello, World") = """ + $show(res$7));$skip(12); val res$8 = 
	"Problems";System.out.println("""res8: String("Problems") = """ + $show(res$8));$skip(173); val res$9 = 
	// without normalization (dividing by x), we get problems:
	// very small numbers don't get accurate results.
	// e.g., sqrt(1e-10) -> 1e-5, but we get 7.8e-3
	sqrt(1e-10);System.out.println("""res9: Double = """ + $show(res$9));$skip(69); val res$10 = 
	// very large numbers cause bottom (does not terminate)
	sqrt(1e60);System.out.println("""res10: Double = """ + $show(res$10))}
}
