import week3_assignment._

object test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  val t1 = new Tweet("tweet1", "test1", 3)        //> t1  : week3_assignment.Tweet = User: tweet1
                                                  //| Text: test1 [3]
  val test = t1.text.contains("foo")              //> test  : Boolean = false
  val t2 = new Tweet("tweet2", "test2", 5)        //> t2  : week3_assignment.Tweet = User: tweet2
                                                  //| Text: test2 [5]
  val t3 = new Tweet("tweet3", "test3", 4)        //> t3  : week3_assignment.Tweet = User: tweet3
                                                  //| Text: test3 [4]
  val tsE = new Empty                             //> tsE  : week3_assignment.Empty = .
  val ts1 = tsE incl t1                           //> ts1  : week3_assignment.TweetSet = .3.
  val ts2 = ts1 incl t2                           //> ts2  : week3_assignment.TweetSet = .3.5.
  val ts3 = ts2 incl t3                           //> ts3  : week3_assignment.TweetSet = .3.5.4.

  val tl1 = new Cons(t1, Nil)                     //> tl1  : week3_assignment.Cons = 3,.
  val tl2 = new Cons(t2, tl1)                     //> tl2  : week3_assignment.Cons = 5,3,.
	val tl3 = new Cons(t3, tl2)               //> tl3  : week3_assignment.Cons = 4,5,3,.
	
	val t4 = new Tweet(9)                     //> t4  : week3_assignment.Tweet = User: user
                                                  //| Text: 9foo [9]
  val t5 = new Tweet(1)                           //> t5  : week3_assignment.Tweet = User: user
                                                  //| Text: 1foo [1]
  val t6 = new Tweet(8)                           //> t6  : week3_assignment.Tweet = User: user
                                                  //| Text: 8foo [8]
  val ts4 = (new Empty).incl(t4).incl(t5).incl(t6)//> ts4  : week3_assignment.TweetSet = .1.8.9.
 
  val u1 = ts3 union ts4                          //> u1  : week3_assignment.TweetSet = .1.8.9.3.5.4.
  val u2 = ts4 union ts3                          //> u2  : week3_assignment.TweetSet = .1.8.9.3.5.4.
  val f1 = u1.filter(t => t.retweets > 4)         //> f1  : week3_assignment.TweetSet = .8.9.5.
  
  val concat = tl3 + tl2                          //> concat  : week3_assignment.TweetList = 4,5,3,5,3,.
  val c2 = (new Empty).toTweetList                //> c2  : week3_assignment.TweetList = .
  val b10  = Nil == Nil                           //> b10  : Boolean = true
  val m1 = f1.mostRetweeted                       //> m1  : week3_assignment.Tweet = User: user
                                                  //| Text: 9foo [9]
  val sort1 = u1.descendingByRetweet              //> sort1  : week3_assignment.TweetList = 9,8,5,4,3,1,.
  
}