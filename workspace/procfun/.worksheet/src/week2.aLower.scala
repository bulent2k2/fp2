package week2

object aLower {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(75); 
  println("Welcome to the Scala worksheet");$skip(83); 

  def sumInts(a: Int, b: Int): Int =
    if (a > b) 0 else a + sumInts(a + 1, b);System.out.println("""sumInts: (a: Int, b: Int)Int""");$skip(28); 

  val x = sumInts(1, 100);System.out.println("""x  : Int = """ + $show(x ));$skip(130); 

  def sumCubes(a: Int, b: Int): Int = {
    def cube(x: Int) = x * x * x
    if (a > b) 0 else cube(a) + sumCubes(a + 1, b)
  };System.out.println("""sumCubes: (a: Int, b: Int)Int""");$skip(27); 

  val y = sumCubes(1, 3);System.out.println("""y  : Int = """ + $show(y ));$skip(63); 

  def fact(x: Int): Int = if (x == 0) 1 else x * fact(x - 1);System.out.println("""fact: (x: Int)Int""");$skip(107); 

  def sumFactorials(a: Int, b: Int): Int = {
    if (a > b) 0 else fact(a) + sumFactorials(a + 1, b)
  };System.out.println("""sumFactorials: (a: Int, b: Int)Int""");$skip(32); 

  val z = sumFactorials(1, 4);System.out.println("""z  : Int = """ + $show(z ))}

}
