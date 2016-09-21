package week1

object newton {
	1 + 3                                     //> res0: Int(4) = 4
	def abs(x: Double) = if (x < 0) -x else x //> abs: (x: Double)Double
	def min(x: Double, y: Double) = if (x < y) x else y
                                                  //> min: (x: Double, y: Double)Double
	
	def sqrtIter(guess: Double, x: Double): Double =
		if (isGoodEnough(guess, x)) guess
		else sqrtIter(improve(guess, x), x)
                                                  //> sqrtIter: (guess: Double, x: Double)Double
		
	def isGoodEnough(guess: Double, x: Double) =
		abs(guess * guess - x) / x < 0.0001
                                                  //> isGoodEnough: (guess: Double, x: Double)Boolean
		
	def improve(guess: Double, x: Double) =
		(guess + x / guess) / 2           //> improve: (guess: Double, x: Double)Double
		
	def sqrt(x: Double) = sqrtIter(1, x)      //> sqrt: (x: Double)Double
	
	sqrt(4)                                   //> res1: Double = 2.0000000929222947
	sqrt(25)                                  //> res2: Double = 5.000023178253949
	sqrt(2)                                   //> res3: Double = 1.4142156862745097
	sqrt(100)                                 //> res4: Double = 10.000052895642693
	sqrt(0.001)                               //> res5: Double = 0.03162278245070105
	sqrt(10000)                               //> res6: Double = 100.00000025490743
	sqrt(0.00001)                             //> res7: Double = 0.0031622926477232706
	"Hello, World"                            //> res8: String("Hello, World") = Hello, World
	"Problems"                                //> res9: String("Problems") = Problems
	// without normalization (dividing by x), we get problems:
	// very small numbers don't get accurate results.
	// e.g., sqrt(1e-10) -> 1e-5, but we get 7.8e-3
	sqrt(1e-10)                               //> res10: Double = 1.0000000015603234E-5
	// very large numbers cause bottom (does not terminate)
	sqrt(1e60)                                //> res11: Double = 1.0000000031080746E30
}