package reference

object testExpr {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(80); 
  println("Welcome to the Scala worksheet");$skip(69); 
  	// new is not needed when it is a case class.
	val n2 = Number(2);System.out.println("""n2  : reference.Number = """ + $show(n2 ));$skip(24); 
	val n3 = new Number(3);System.out.println("""n3  : reference.Number = """ + $show(n3 ));$skip(26); 
	val s5 = new Sum(n2, n3);System.out.println("""s5  : reference.Sum = """ + $show(s5 ));$skip(9); val res$0 = 
	n2.show;System.out.println("""res0: String = """ + $show(res$0));$skip(9); val res$1 = 
	n3.show;System.out.println("""res1: String = """ + $show(res$1));$skip(9); val res$2 = 
	s5.show;System.out.println("""res2: String = """ + $show(res$2));$skip(9); val res$3 = 
	s5.eval;System.out.println("""res3: Int = """ + $show(res$3));$skip(11); val res$4 = 
  s5.eval2;System.out.println("""res4: Int = """ + $show(res$4));$skip(9); val res$5 = 
	n3.eval;System.out.println("""res5: Int = """ + $show(res$5));$skip(28); val res$6 = 
	Sum(n3, Sum(s5, s5)).eval2;System.out.println("""res6: Int = """ + $show(res$6));$skip(10); val res$7 = 
	s5.show2;System.out.println("""res7: String = """ + $show(res$7));$skip(22); 
	val e1 = Sum(s5, n3);System.out.println("""e1  : reference.Sum = """ + $show(e1 ));$skip(10); val res$8 = 
	e1.show2;System.out.println("""res8: String = """ + $show(res$8));$skip(136); 

	def show(e: Expr): String = e match {
		case Number(n) => n.toString
		case Sum(e1, e2) => "(" + show(e1) + " + " + show(e2) + ")"
	};System.out.println("""show: (e: reference.Expr)String""");$skip(12); val res$9 = 
	
	show(e1);System.out.println("""res9: String = """ + $show(res$9))}
	
}
