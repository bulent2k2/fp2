package week1

object fCoins {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(74); 
  println("Welcome to the Scala worksheet");$skip(36); 
  
  val list = List(1,5,2,25,10,5);System.out.println("""list  : List[Int] = """ + $show(list ));$skip(14); val res$0 = 
  list.sorted;System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(46); val res$1 = 
  (list++List(0)).toSet.toList.sorted.reverse;System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(457); 
  
  def countChange(money: Int, coins2: List[Int]): Int = {
  	
  	def howMany(acc: Int, coins: List[Int], target: Int): Int = {
  		if (coins.head == 0 || target <= 0) acc else {
  			val max_coin = coins.head
  			val incr = if (target == max_coin) 1 else 0
  			howMany(acc + incr, coins, target - max_coin) + howMany(acc, coins.tail, target)
  		}
  	}
  	
  	val sorted = (coins2++List(0)).toSet.toList.sorted.reverse
  	howMany(0, sorted, money)
  };System.out.println("""countChange: (money: Int, coins2: List[Int])Int""");$skip(52); val res$2 = 
  
  countChange(50, List(10, 50, 100, 50, 20, 10));System.out.println("""res2: Int = """ + $show(res$2));$skip(50); 
  val coins = List(100, 200, 50, 20, 5, 10, 2, 1);System.out.println("""coins  : List[Int] = """ + $show(coins ));$skip(34); val res$3 = 
  countChange(10, coins)    == 11;System.out.println("""res3: Boolean = """ + $show(res$3));$skip(34); val res$4 = 
  countChange(11, coins)    == 12;System.out.println("""res4: Boolean = """ + $show(res$4));$skip(34); val res$5 = 
  countChange(12, coins)    == 15;System.out.println("""res5: Boolean = """ + $show(res$5));$skip(34); val res$6 = 
  countChange(22, coins)    == 51;System.out.println("""res6: Boolean = """ + $show(res$6));$skip(35); val res$7 = 
  countChange(50, coins)    == 451;System.out.println("""res7: Boolean = """ + $show(res$7))}
}
