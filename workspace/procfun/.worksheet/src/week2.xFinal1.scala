package week2

// see class in  package.scala > package > Rational
object xFinal1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(113); 
  val t1 = new Rational(1, 2);System.out.println("""t1  : week2.Rational = """ + $show(t1 ));$skip(19); 
  val t2 = t1 + t1;System.out.println("""t2  : week2.Rational = """ + $show(t2 ));$skip(19); 
  val t3 = t1 * t1;System.out.println("""t3  : week2.Rational = """ + $show(t3 ));$skip(34); 
  val t5 = -new Rational(-10, 20);System.out.println("""t5  : week2.Rational = """ + $show(t5 ));$skip(19); 
  val b1 = t5 < t3;System.out.println("""b1  : Boolean = """ + $show(b1 ));$skip(19); 
  val b2 = t3 < t5;System.out.println("""b2  : Boolean = """ + $show(b2 ));$skip(27); 
  val t6 = new Rational(7);System.out.println("""t6  : week2.Rational = """ + $show(t6 ));$skip(19); 
  val t7 = t6 * t6;System.out.println("""t7  : week2.Rational = """ + $show(t7 ));$skip(35); 
  val t8 = t7 * new Rational(1, 7);System.out.println("""t8  : week2.Rational = """ + $show(t8 ));$skip(19); 
  val t4 = t3 - t1;System.out.println("""t4  : week2.Rational = """ + $show(t4 ));$skip(35); 
  val strange = new Rational(3, 0);System.out.println("""strange  : week2.Rational = """ + $show(strange ))}

}


  
  