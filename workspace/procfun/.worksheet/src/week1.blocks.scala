package week1

object blocks {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(202); 

	// blocks and lexical scope..
	// block is an expression
	// inner values are hidden from the outside
	// outer values are available but can be shadowed.
	  
  val x = 0;System.out.println("""x  : Int = """ + $show(x ));$skip(24); 
  def f(y: Int) = y + 1;System.out.println("""f: (y: Int)Int""");$skip(50); 
  val result = {
  	val x = f(3)
  	x * x
  } + x;System.out.println("""result  : Int = """ + $show(result ))}
}
