package week6

object forcomp {
  type Word = String
  type Sentence = List[Word]
  type Pair = (Char, Int)
  type Occurrences = List[Pair];import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(252); 
  val dictionary: List[Word] = List("Canim", "Benim.", "Zor", "Ile", "Guzellik", "Olmaz.", "tea", "ate", "eat");System.out.println("""dictionary  : List[week6.forcomp.Word] = """ + $show(dictionary ));$skip(271); 

  // TODO: remove non-alphabetic chars..
  def wordOccurrences(w: Word): Occurrences = {
    val mapCharToChars = w.groupBy((c: Char) => c.toLower.toChar)
    mapCharToChars.map { case (k, v) => (k, v.size) }.toList.sortWith((p1, p2) => p1._1.compareTo(p2._1) < 0)
  };System.out.println("""wordOccurrences: (w: week6.forcomp.Word)week6.forcomp.Occurrences""");$skip(84); 

  def sentenceOccurrences(s: Sentence): Occurrences = wordOccurrences(s.mkString);System.out.println("""sentenceOccurrences: (s: week6.forcomp.Sentence)week6.forcomp.Occurrences""");$skip(117); 

  lazy val dictionaryByOccurrences: Map[Occurrences, List[Word]] =
    dictionary.groupBy(w => wordOccurrences(w));System.out.println("""dictionaryByOccurrences: => Map[week6.forcomp.Occurrences,List[week6.forcomp.Word]]""");$skip(98); 

  def wordAnagrams(word: Word): List[Word] =
    dictionaryByOccurrences(wordOccurrences(word));System.out.println("""wordAnagrams: (word: week6.forcomp.Word)List[week6.forcomp.Word]""");$skip(189); 

  def powerset[T](list: List[T]): List[List[T]] = list match {
    case List() => List(Nil)
    case x :: xs => {
      val sub = powerset(xs)
      sub ++ sub.map(y => x :: y)
    }
  };System.out.println("""powerset: [T](list: List[T])List[List[T]]""");$skip(142); 

  def setOfOccurrences(occs: Occurrences): Occurrences =
    for (
      (char, count) <- occs;
      i <- 1 to count
    ) yield (char, i);System.out.println("""setOfOccurrences: (occs: week6.forcomp.Occurrences)week6.forcomp.Occurrences""");$skip(157); 
  // setOfOccurrences(occs).mkString("\n")

  def setOfOcc2(occs: Occurrences): List[Occurrences] =
    for (occ <- occs) yield setOfOccurrences(List(occ));System.out.println("""setOfOcc2: (occs: week6.forcomp.Occurrences)List[week6.forcomp.Occurrences]""");$skip(72); 

  def combinations(occurrences: Occurrences): List[Occurrences] = ???;System.out.println("""combinations: (occurrences: week6.forcomp.Occurrences)List[week6.forcomp.Occurrences]""");$skip(147); 
  // 	powerset(occurrences)

  def combinationsTooMuch(occurrences: Occurrences): List[Occurrences] =
    powerset(setOfOccurrences(occurrences));System.out.println("""combinationsTooMuch: (occurrences: week6.forcomp.Occurrences)List[week6.forcomp.Occurrences]""");$skip(30); 

  val word = "xxyyyaabcabc";System.out.println("""word  : String = """ + $show(word ));$skip(35); 
  val occs = wordOccurrences(word);System.out.println("""occs  : week6.forcomp.Occurrences = """ + $show(occs ));$skip(20); val res$0 = 

  setOfOcc2(occs);System.out.println("""res0: List[week6.forcomp.Occurrences] = """ + $show(res$0));$skip(26); val res$1 = 
  powerset(List(1, 2, 3));System.out.println("""res1: List[List[Int]] = """ + $show(res$1));$skip(40); 

  val test = List(('a', 2), ('b', 2));System.out.println("""test  : List[(Char, Int)] = """ + $show(test ));$skip(56); val res$2 = 
  // combinations(test).mkString("\n")

	powerset(test);System.out.println("""res2: List[List[(Char, Int)]] = """ + $show(res$2));$skip(48); val res$3 = 
  
  powerset(test).map(x => expand(x)).flatten;System.out.println("""res3: List[week6.forcomp.Occurrences] = """ + $show(res$3));$skip(141); 
  
  def expand(occs: Occurrences): List[Occurrences] = occs match {
  	case List() => List(List())
  	case (char, count)::occs2 => ???
  	};System.out.println("""expand: (occs: week6.forcomp.Occurrences)List[week6.forcomp.Occurrences]""");$skip(403); val res$4 = 
  	
  /*
  def expand(list: List[Occurrences]): List[Occurrences] = list match {
  	case Nil => Nil
  	case List(Nil) => List(Nil)
  	case List((char, count)::Nil) => for (i <- 1 to count) yield List((char, i))
  	case occ::l2 =>
  }
                                         
 	expand(powerset(test))
  	                   
  	                   */
  powerset(test).map(occs => setOfOcc2(occs)).flatten;System.out.println("""res4: List[week6.forcomp.Occurrences] = """ + $show(res$4));$skip(105); val res$5 = 

  for (
    list <- powerset(test);
    (char, count) <- list;
    i <- 1 to count
  ) yield (char, i);System.out.println("""res5: List[(Char, Int)] = """ + $show(res$5));$skip(30); 

  val s1 = List(word, word);System.out.println("""s1  : List[String] = """ + $show(s1 ));$skip(26); val res$6 = 
  sentenceOccurrences(s1);System.out.println("""res6: week6.forcomp.Occurrences = """ + $show(res$6));$skip(36); val res$7 = 

  dictionaryByOccurrences take 10;System.out.println("""res7: scala.collection.immutable.Map[week6.forcomp.Occurrences,List[week6.forcomp.Word]] = """ + $show(res$7));$skip(24); val res$8 = 

  wordAnagrams("tea");System.out.println("""res8: List[week6.forcomp.Word] = """ + $show(res$8))}

}
