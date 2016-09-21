import week3_assignment._

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(85); 
  println("Welcome to the Scala worksheet");$skip(45); 

  val t1 = new Tweet("tweet1", "test1", 3);System.out.println("""t1  : week3_assignment.Tweet = """ + $show(t1 ));$skip(37); 
  val test = t1.text.contains("foo");System.out.println("""test  : Boolean = """ + $show(test ));$skip(43); 
  val t2 = new Tweet("tweet2", "test2", 5);System.out.println("""t2  : week3_assignment.Tweet = """ + $show(t2 ));$skip(43); 
  val t3 = new Tweet("tweet3", "test3", 4);System.out.println("""t3  : week3_assignment.Tweet = """ + $show(t3 ));$skip(22); 
  val tsE = new Empty;System.out.println("""tsE  : week3_assignment.Empty = """ + $show(tsE ));$skip(24); 
  val ts1 = tsE incl t1;System.out.println("""ts1  : week3_assignment.TweetSet = """ + $show(ts1 ));$skip(24); 
  val ts2 = ts1 incl t2;System.out.println("""ts2  : week3_assignment.TweetSet = """ + $show(ts2 ));$skip(24); 
  val ts3 = ts2 incl t3;System.out.println("""ts3  : week3_assignment.TweetSet = """ + $show(ts3 ));$skip(32); 

  val tl1 = new Cons(t1, Nil);System.out.println("""tl1  : week3_assignment.Cons = """ + $show(tl1 ));$skip(30); 
  val tl2 = new Cons(t2, tl1);System.out.println("""tl2  : week3_assignment.Cons = """ + $show(tl2 ));$skip(29); 
	val tl3 = new Cons(t3, tl2);System.out.println("""tl3  : week3_assignment.Cons = """ + $show(tl3 ));$skip(25); 
	
	val t4 = new Tweet(9);System.out.println("""t4  : week3_assignment.Tweet = """ + $show(t4 ));$skip(24); 
  val t5 = new Tweet(1);System.out.println("""t5  : week3_assignment.Tweet = """ + $show(t5 ));$skip(24); 
  val t6 = new Tweet(8);System.out.println("""t6  : week3_assignment.Tweet = """ + $show(t6 ));$skip(51); 
  val ts4 = (new Empty).incl(t4).incl(t5).incl(t6);System.out.println("""ts4  : week3_assignment.TweetSet = """ + $show(ts4 ));$skip(28); 
 
  val u1 = ts3 union ts4;System.out.println("""u1  : week3_assignment.TweetSet = """ + $show(u1 ));$skip(25); 
  val u2 = ts4 union ts3;System.out.println("""u2  : week3_assignment.TweetSet = """ + $show(u2 ));$skip(42); 
  val f1 = u1.filter(t => t.retweets > 4);System.out.println("""f1  : week3_assignment.TweetSet = """ + $show(f1 ));$skip(28); 
  
  val concat = tl3 + tl2;System.out.println("""concat  : week3_assignment.TweetList = """ + $show(concat ));$skip(35); 
  val c2 = (new Empty).toTweetList;System.out.println("""c2  : week3_assignment.TweetList = """ + $show(c2 ));$skip(24); 
  val b10  = Nil == Nil;System.out.println("""b10  : Boolean = """ + $show(b10 ));$skip(28); 
  val m1 = f1.mostRetweeted;System.out.println("""m1  : week3_assignment.Tweet = """ + $show(m1 ));$skip(37); 
  val sort1 = u1.descendingByRetweet;System.out.println("""sort1  : week3_assignment.TweetList = """ + $show(sort1 ))}
  
}
