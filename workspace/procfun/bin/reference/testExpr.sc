package reference

object testExpr {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  	// new is not needed when it is a case class.
	val n2 = Number(2)                        //> n2  : reference.Number = Number(2)
	val n3 = new Number(3)                    //> n3  : reference.Number = Number(3)
	val s5 = new Sum(n2, n3)                  //> s5  : reference.Sum = Sum(Number(2),Number(3))
	n2.show                                   //> res0: String = 2
	n3.show                                   //> res1: String = 3
	s5.show                                   //> res2: String = 2 + 3
	s5.eval                                   //> res3: Int = 5
  s5.eval2                                        //> res4: Int = 5
	n3.eval                                   //> res5: Int = 3
	Sum(n3, Sum(s5, s5)).eval2                //> res6: Int = 13
	s5.show2                                  //> res7: String = (2 + 3)
	val e1 = Sum(s5, n3)                      //> e1  : reference.Sum = Sum(Sum(Number(2),Number(3)),Number(3))
	e1.show2                                  //> res8: String = ((2 + 3) + 3)

	def show(e: Expr): String = e match {
		case Number(n) => n.toString
		case Sum(e1, e2) => "(" + show(e1) + " + " + show(e2) + ")"
	}                                         //> show: (e: reference.Expr)String
	
	show(e1)                                  //> res9: String = ((2 + 3) + 3)
	
}