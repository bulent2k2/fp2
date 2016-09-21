package reference

object tests {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(78); 
  println("Welcome to the Scala worksheet");$skip(8); val res$0 = 

	true2;System.out.println("""res0: reference.true2.type = """ + $show(res$0));$skip(8); val res$1 = 
	false2;System.out.println("""res1: reference.false2.type = """ + $show(res$1));$skip(18); val res$2 = 
	true2 and false2;System.out.println("""res2: reference.Boolean2 = """ + $show(res$2));$skip(8); val res$3 = 
	
	Zero;System.out.println("""res3: reference.Zero.type = """ + $show(res$3));$skip(16); val res$4 = 
	Zero.successor;System.out.println("""res4: reference.Nat = """ + $show(res$4));$skip(26); 
	val One = Zero.successor;System.out.println("""One  : reference.Nat = """ + $show(One ));$skip(25); 
	val Two = One.successor;System.out.println("""Two  : reference.Nat = """ + $show(Two ));$skip(15); val res$5 = 
	
	
  List2(1);System.out.println("""res5: reference.Cons2[Int] = """ + $show(res$5));$skip(10); val res$6 = 
  List2();System.out.println("""res6: reference.Nil2[Nothing] = """ + $show(res$6));$skip(15); val res$7 = 
  List2(1, -1);System.out.println("""res7: reference.Cons2[Int] = """ + $show(res$7));$skip(14); val res$8 = 
  List2(0, 1);System.out.println("""res8: reference.Cons2[Int] = """ + $show(res$8));$skip(8); val res$9 = 

  Nil2;System.out.println("""res9: reference.Nil2.type = """ + $show(res$9))}
	
}
