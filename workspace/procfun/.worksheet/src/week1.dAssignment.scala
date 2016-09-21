package week1

object dAssignment {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(80); 
  println("Welcome to the Scala worksheet");$skip(188); 

  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  };System.out.println("""main: (args: Array[String])Unit""");$skip(149); 

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int =
    if (c == 0 || c == r || r == 1) 1 else pascal(c, r - 1) + pascal(c - 1, r - 1);System.out.println("""pascal: (c: Int, r: Int)Int""");$skip(33); 

  println("Pascal's Triangle");$skip(105); 
  for (row <- 0 to 10) {
    for (col <- 0 to row)
      print(pascal(col, row) + " ")
    println()
  }}


}
