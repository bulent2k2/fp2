package object week3_assignment {

  class Tweet(val user: String, val text: String, val retweets: Int) {
    def this(retweets: Int) = this("user", retweets.toString + "foo", retweets)
    override def toString: String =
      "User: " + user + "\n" +
        "Text: " + text + " [" + retweets + "]"
  }

  abstract class TweetSet {
    override def toString: String
    def toTweetList: TweetList
    def filter(p: Tweet => Boolean): TweetSet = filterAcc(p, new Empty)
    def filterAcc(p: Tweet => Boolean, acc: TweetSet): TweetSet
    def union(that: TweetSet): TweetSet
    def mostRetweeted: Tweet
    def descendingByRetweet: TweetList
    def incl(tweet: Tweet): TweetSet
    def remove(tweet: Tweet): TweetSet
    def contains(tweet: Tweet): Boolean
    def foreach(f: Tweet => Unit): Unit
  }

  class Empty extends TweetSet {
    override def toString: String = "."
    def toTweetList: TweetList = Nil
    def filterAcc(p: Tweet => Boolean, acc: TweetSet): TweetSet = new Empty
    def union(that: TweetSet): TweetSet = that
    def contains(tweet: Tweet): Boolean = false
    def incl(tweet: Tweet): TweetSet = new NonEmpty(tweet, new Empty, new Empty)
    def remove(tweet: Tweet): TweetSet = this
    def foreach(f: Tweet => Unit): Unit = ()
    def mostRetweeted: Tweet = throw new java.util.NoSuchElementException("Asking for mostRetweeted in Empty set.")
    def descendingByRetweet: TweetList = Nil
  }

  class NonEmpty(elem: Tweet, left: TweetSet, right: TweetSet) extends TweetSet {
    override def toString: String = left.toString + elem.retweets + right.toString
    def toTweetList: TweetList =
      new Cons(elem, left.toTweetList + right.toTweetList)
    def union(that: TweetSet): TweetSet =
      ((left union right) union that) incl elem
    def filterAcc(p: Tweet => Boolean, acc: TweetSet): TweetSet = {
      val cache = right.filterAcc(p, acc) union left.filterAcc(p, acc)
      if (p(elem)) cache.incl(elem) else cache
    }
    def contains(x: Tweet): Boolean =
      if (x.text < elem.text) left.contains(x)
      else if (elem.text < x.text) right.contains(x)
      else true
    def incl(x: Tweet): TweetSet = {
      if (x.text < elem.text) new NonEmpty(elem, left.incl(x), right)
      else if (elem.text < x.text) new NonEmpty(elem, left, right.incl(x))
      else this
    }
    def remove(tw: Tweet): TweetSet =
      if (tw.text < elem.text) new NonEmpty(elem, left.remove(tw), right)
      else if (elem.text < tw.text) new NonEmpty(elem, left, right.remove(tw))
      else left.union(right)
    def foreach(f: Tweet => Unit): Unit = {
      f(elem)
      left.foreach(f)
      right.foreach(f)
    }
    /* inefficient! Why? BBX
    def mostRetweeted: Tweet = {
      val f = (t: Tweet) => t.retweets > elem.retweets
      val subset = this.filter(f)
      if (subset.toTweetList == Nil) elem
      else subset.mostRetweeted
    } */
    def mostRetweeted: Tweet = {
      def loop(maxSoFar: Tweet, set: TweetSet): Tweet = { // set contains maxSoFar
        def f = (t: Tweet) => t.retweets > maxSoFar.retweets
        val ts = set.filter(f)
        if (ts.toString == ".") maxSoFar else loop(ts.mostRetweeted, ts)
      }
      loop(elem, this)
    }
    def descendingByRetweet: TweetList =
      new Cons(mostRetweeted, remove(mostRetweeted).descendingByRetweet)
  }

  trait TweetList {
    override def toString: String
    def head: Tweet
    def tail: TweetList
    def isEmpty: Boolean
    def foreach(f: Tweet => Unit): Unit =
      if (!isEmpty) {
        f(head)
        tail.foreach(f)
      }
    def +(that: TweetList): TweetList
  }

  object Nil extends TweetList {
    override def toString: String = "."
    def head = throw new java.util.NoSuchElementException("head of EmptyList")
    def tail = throw new java.util.NoSuchElementException("tail of EmptyList")
    def isEmpty = true
    def +(that: TweetList): TweetList = that
  }

  class Cons(val head: Tweet, val tail: TweetList) extends TweetList {
    def isEmpty = false
    override def toString: String = head.retweets + "," + tail.toString()
    def +(that: TweetList): TweetList = new Cons(head, (tail + that))
  }

}