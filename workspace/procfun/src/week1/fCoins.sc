package week1

object fCoins {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val list = List(1,5,2,25,10,5)                  //> list  : List[Int] = List(1, 5, 2, 25, 10, 5)
  list.sorted                                     //> res0: List[Int] = List(1, 2, 5, 5, 10, 25)
  (list++List(0)).toSet.toList.sorted.reverse     //> res1: List[Int] = List(25, 10, 5, 2, 1, 0)
  
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
  }                                               //> countChange: (money: Int, coins2: List[Int])Int
  
  countChange(50, List(10, 50, 100, 50, 20, 10))  //> res2: Int = 4
  val coins = List(100, 200, 50, 20, 5, 10, 2, 1) //> coins  : List[Int] = List(100, 200, 50, 20, 5, 10, 2, 1)
  countChange(10, coins)    == 11                 //> res3: Boolean = true
  countChange(11, coins)    == 12                 //> res4: Boolean = true
  countChange(12, coins)    == 15                 //> res5: Boolean = true
  countChange(22, coins)    == 51                 //> res6: Boolean = true
  countChange(50, coins)    == 451                //> res7: Boolean = true
}