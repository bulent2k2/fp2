package week3

object aIntSetClass {

  val s4 = Empty incl 4 incl 6                    //> s4  : week3.IntSet = {.4{.6.}}
  val u4 = s4 union s4                            //> u4  : week3.IntSet = {.4{.6.}}

  val x = new NonEmpty(5, new NonEmpty(3, Empty, Empty), Empty)
                                                  //> x  : week3.NonEmpty = {{.3.}5.}
  val s2 = x incl 4                               //> s2  : week3.IntSet = {{.3{.4.}}5.}
  val s3 = s2 incl 7                              //> s3  : week3.IntSet = {{.3{.4.}}5{.7.}}
  val b1 = s3 contains 5                          //> b1  : Boolean = true
  val b2 = s3 contains 3                          //> b2  : Boolean = true
  val b3 = s3 contains 7                          //> b3  : Boolean = true
  val b4 = s3 contains 20                         //> b4  : Boolean = false
  val b5 = s3 contains -10                        //> b5  : Boolean = false

  val u1 = s4 union s3                            //> u1  : week3.IntSet = {{.3{.4.}}5{{.6.}7.}}
  val u2 = s3 union s4                            //> u2  : week3.IntSet = {{.3.}4{{.5.}6{.7.}}}
  val u3 = s3 union s3                            //> u3  : week3.IntSet = {{.3{.4.}}5{.7.}}

  val b6 = s3 == (s3 union s3)                    //> b6  : Boolean = true

  def main(args: Array[String]) = {
    println("hello world!")
    println(x)
  }                                               //> main: (args: Array[String])Unit

}
