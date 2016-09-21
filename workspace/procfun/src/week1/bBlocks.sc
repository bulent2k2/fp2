package week1

object blocks {

	// blocks and lexical scope..
	// block is an expression
	// inner values are hidden from the outside
	// outer values are available but can be shadowed.
	  
  val x = 0                                       //> x  : Int = 0
  def f(y: Int) = y + 1                           //> f: (y: Int)Int
  val result = {
  	val x = f(3)
  	x * x
  } + x                                           //> result  : Int = 16
}