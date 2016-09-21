package misc

object groupBy {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(74); 
  println("Welcome to the Scala worksheet");$skip(82); 
  
  val words = List("boy", "girl", "boy", "man", "woman", "man", "girl", "boy");System.out.println("""words  : List[String] = """ + $show(words ));$skip(53); 
  val counts = words.groupBy(w=>w).mapValues(_.size);System.out.println("""counts  : scala.collection.immutable.Map[String,Int] = """ + $show(counts ));$skip(70); 
  (counts map {case (k,v) => k ++ " " ++ v.toString}) foreach println}

}
