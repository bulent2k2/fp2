package week2

// see class in  package.scala > package > Rational
object xFinal1 {
  val t1 = new Rational(1, 2)                     //> t1  : week2.Rational = 1/2
  val t2 = t1 + t1                                //> t2  : week2.Rational = 1/1
  val t3 = t1 * t1                                //> t3  : week2.Rational = 1/4
  val t5 = -new Rational(-10, 20)                 //> t5  : week2.Rational = 1/2
  val b1 = t5 < t3                                //> b1  : Boolean = false
  val b2 = t3 < t5                                //> b2  : Boolean = true
  val t6 = new Rational(7)                        //> t6  : week2.Rational = 7/1
  val t7 = t6 * t6                                //> t7  : week2.Rational = 49/1
  val t8 = t7 * new Rational(1, 7)                //> t8  : week2.Rational = 7/1
  val t4 = t3 - t1                                //> t4  : week2.Rational = -1/4
  val strange = new Rational(3, 0)                //> java.lang.IllegalArgumentException: requirement failed: denominator must be 
                                                  //| positive
                                                  //| 	at scala.Predef$.require(Predef.scala:224)
                                                  //| 	at week2.package$Rational.<init>(package.scala:8)
                                                  //| 	at week2.xFinal1$$anonfun$main$1.apply$mcV$sp(week2.xFinal1.scala:15)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at week2.xFinal1$.main(week2.xFinal1.scala:4)
                                                  //| 	at week2.xFinal1.main(week2.xFinal1.scala)

}


  
  