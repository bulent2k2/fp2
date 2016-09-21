package week1

object eBalance {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  	val list = "here is (just an) example".toList
                                                  //> list  : List[Char] = List(h, e, r, e,  , i, s,  , (, j, u, s, t,  , a, n, ),
                                                  //|   , e, x, a, m, p, l, e)
	
	list.reverse                              //> res0: List[Char] = List(e, l, p, m, a, x, e,  , ), n, a,  , t, s, u, j, (,  
                                                  //| , s, i,  , e, r, e, h)
	list.indexOf('(')                         //> res1: Int = 8
	list.drop(8).indexOf('(')                 //> res2: Int = 0
	
	val list2 = List(0,1,2,3,4,5,6)           //> list2  : List[Int] = List(0, 1, 2, 3, 4, 5, 6)
	list2.dropRight(3)                        //> res3: List[Int] = List(0, 1, 2, 3)
	list2.drop(2)                             //> res4: List[Int] = List(2, 3, 4, 5, 6)
	list2.drop(2).dropRight(3)                //> res5: List[Int] = List(2, 3)
	list2.size                                //> res6: Int = 7
	
	  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {

      def countChar(chars: List[Char], ch: Char): Int = {
        if (chars.isEmpty) 0 else {
          if (chars.head == ch) 1 + countChar(chars.tail, ch) else countChar(chars.tail, ch)
        }
      }

      val open = '('
      val close = ')'
      val reverse = chars.reverse
      val numOpen = countChar(chars, open)
      val numClose = countChar(chars, close)
      if (chars.isEmpty || (numOpen == 0 && numClose == 0)) true else if (numOpen != numClose ) false else {
        val firstOpen = chars.indexOf(open)
        val lastClose = chars.size - reverse.indexOf(close) - 1
        if ( firstOpen > chars.indexOf(close) || reverse.indexOf(close) > reverse.indexOf(open)) false else {
          balance(chars.drop(firstOpen + 1).dropRight(lastClose + 1))
        }
      }
  }                                               //> balance: (chars: List[Char])Boolean
  
  balance("(if (zero? x) max (/ 1 x))".toList)    //> res7: Boolean = true
  
	balance("I told him (that it’s not (yet) done). (But he wasn’t listening)".toList)
                                                  //> res8: Boolean = true

	balance(":-)".toList)                     //> res9: Boolean = false
	balance("())(".toList)                    //> res10: Boolean = false

}