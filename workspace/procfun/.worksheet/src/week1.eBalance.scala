package week1

object eBalance {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(76); 
  println("Welcome to the Scala worksheet");$skip(52); 
  
  	val list = "here is (just an) example".toList;System.out.println("""list  : List[Char] = """ + $show(list ));$skip(16); val res$0 = 
	
	list.reverse;System.out.println("""res0: List[Char] = """ + $show(res$0));$skip(19); val res$1 = 
	list.indexOf('(');System.out.println("""res1: Int = """ + $show(res$1));$skip(27); val res$2 = 
	list.drop(8).indexOf('(');System.out.println("""res2: Int = """ + $show(res$2));$skip(35); 
	
	val list2 = List(0,1,2,3,4,5,6);System.out.println("""list2  : List[Int] = """ + $show(list2 ));$skip(20); val res$3 = 
	list2.dropRight(3);System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(15); val res$4 = 
	list2.drop(2);System.out.println("""res4: List[Int] = """ + $show(res$4));$skip(28); val res$5 = 
	list2.drop(2).dropRight(3);System.out.println("""res5: List[Int] = """ + $show(res$5));$skip(12); val res$6 = 
	list2.size;System.out.println("""res6: Int = """ + $show(res$6));$skip(870); 
	
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
  };System.out.println("""balance: (chars: List[Char])Boolean""");$skip(50); val res$7 = 
  
  balance("(if (zero? x) max (/ 1 x))".toList);System.out.println("""res7: Boolean = """ + $show(res$7));$skip(87); val res$8 = 
  
	balance("I told him (that it’s not (yet) done). (But he wasn’t listening)".toList);System.out.println("""res8: Boolean = """ + $show(res$8));$skip(24); val res$9 = 

	balance(":-)".toList);System.out.println("""res9: Boolean = """ + $show(res$9));$skip(24); val res$10 = 
	balance("())(".toList);System.out.println("""res10: Boolean = """ + $show(res$10))}

}
