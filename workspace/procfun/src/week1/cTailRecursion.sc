package week1

object cTailRecursion {
  println("Tail recursion gets us the loop behavior in imperative programming")
                                                  //> Tail recursion gets us the loop behavior in imperative programming
  
  // @tailrec
  def gcd(x: Integer, y: Integer): Integer =
  	if (y == 0) x else gcd(y, x % y)          //> gcd: (x: Integer, y: Integer)Integer
  	
  gcd(10,5)                                       //> res0: Integer = 5
  gcd(3,7)                                        //> res1: Integer = 1
  gcd(5,0)                                        //> res2: Integer = 5
  gcd(15,21)                                      //> res3: Integer = 3
  gcd(120,600)                                    //> res4: Integer = 120
  
  def factorial(n: Integer): Integer =
  	if (n == 0) 1 else n * factorial(n-1)     //> factorial: (n: Integer)Integer
  	
  factorial(5)                                    //> res5: Integer = 120
  factorial(20)                                   //> res6: Integer = -2102132736
  factorial(15)                                   //> res7: Integer = 2004310016

	// lets make it tail recursive so that we don't have to use more than one stack frame
	def fact2(n: Int): Int = {
		def loop(acc: Int, n: Int): Int =
			if (n == 0) acc
			else loop(acc * n, n-1)
		loop(1, n)
	}                                         //> fact2: (n: Int)Int
	
	fact2(15)                                 //> res8: Int = 2004310016
  fact2(20)                                       //> res9: Int = -2102132736
  
}