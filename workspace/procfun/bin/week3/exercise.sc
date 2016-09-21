import week2.Rational

import week3._

object exercise {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  new Rational(7, 49)                             //> res0: week2.Rational = 1/7

  def error(msg: String) = throw new Error(msg)   //> error: (msg: String)Nothing

  val x = null                                    //> x  : Null = null
  val y: String = x                               //> y  : String = null

  if (true) 1 else false                          //> res1: AnyVal = 1

  val z: Any = "Hello"                            //> z  : Any = Hello

  def f(x: Int): (Int => Int) = a => x * a        //> f: (x: Int)Int => Int
  f(3)                                            //> res2: Int => Int = <function1>
  f(3)(5)                                         //> res3: Int = 15

	Empty == Empty                            //> res4: Boolean = true
	new Rational(1) == new Rational(1)        //> res5: Boolean = false
	var r1 = new Rational(1)                  //> r1  : week2.Rational = 1/1
	var r2 = new Rational(1)                  //> r2  : week2.Rational = 1/1
	r1.toString == r2.toString                //> res6: Boolean = true
	new Rational(1).toString                  //> res7: String = 1/1
	
  error("Just testing")                           //> java.lang.Error: Just testing
                                                  //| 	at exercise$$anonfun$main$1.error$1(exercise.scala:9)
                                                  //| 	at exercise$$anonfun$main$1.apply$mcV$sp(exercise.scala:29)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at exercise$.main(exercise.scala:5)
                                                  //| 	at exercise.main(exercise.scala)
                                                  
}