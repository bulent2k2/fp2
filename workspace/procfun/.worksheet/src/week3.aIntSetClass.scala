package week3

object aIntSetClass {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(68); 

  val s4 = Empty incl 4 incl 6;System.out.println("""s4  : week3.IntSet = """ + $show(s4 ));$skip(23); 
  val u4 = s4 union s4;System.out.println("""u4  : week3.IntSet = """ + $show(u4 ));$skip(65); 

  val x = new NonEmpty(5, new NonEmpty(3, Empty, Empty), Empty);System.out.println("""x  : week3.NonEmpty = """ + $show(x ));$skip(20); 
  val s2 = x incl 4;System.out.println("""s2  : week3.IntSet = """ + $show(s2 ));$skip(21); 
  val s3 = s2 incl 7;System.out.println("""s3  : week3.IntSet = """ + $show(s3 ));$skip(25); 
  val b1 = s3 contains 5;System.out.println("""b1  : Boolean = """ + $show(b1 ));$skip(25); 
  val b2 = s3 contains 3;System.out.println("""b2  : Boolean = """ + $show(b2 ));$skip(25); 
  val b3 = s3 contains 7;System.out.println("""b3  : Boolean = """ + $show(b3 ));$skip(26); 
  val b4 = s3 contains 20;System.out.println("""b4  : Boolean = """ + $show(b4 ));$skip(27); 
  val b5 = s3 contains -10;System.out.println("""b5  : Boolean = """ + $show(b5 ));$skip(24); 

  val u1 = s4 union s3;System.out.println("""u1  : week3.IntSet = """ + $show(u1 ));$skip(23); 
  val u2 = s3 union s4;System.out.println("""u2  : week3.IntSet = """ + $show(u2 ));$skip(23); 
  val u3 = s3 union s3;System.out.println("""u3  : week3.IntSet = """ + $show(u3 ));$skip(32); 

  val b6 = s3 == (s3 union s3);System.out.println("""b6  : Boolean = """ + $show(b6 ));$skip(84); 

  def main(args: Array[String]) = {
    println("hello world!")
    println(x)
  };System.out.println("""main: (args: Array[String])Unit""")}

}
