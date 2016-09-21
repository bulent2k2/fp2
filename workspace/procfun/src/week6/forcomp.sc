package week6

object forcomp {
  type Word = String
  type Sentence = List[Word]
  type Pair = (Char, Int)
  type Occurrences = List[Pair]
  val dictionary: List[Word] = List("Canim", "Benim.", "Zor", "Ile", "Guzellik", "Olmaz.", "tea", "ate", "eat")

  // TODO: remove non-alphabetic chars..
  def wordOccurrences(w: Word): Occurrences = {
    val mapCharToChars = w.groupBy((c: Char) => c.toLower.toChar)
    mapCharToChars.map { case (k, v) => (k, v.size) }.toList.sortWith((p1, p2) => p1._1.compareTo(p2._1) < 0)
  }

  def sentenceOccurrences(s: Sentence): Occurrences = wordOccurrences(s.mkString)

  lazy val dictionaryByOccurrences: Map[Occurrences, List[Word]] =
    dictionary.groupBy(w => wordOccurrences(w))

  def wordAnagrams(word: Word): List[Word] =
    dictionaryByOccurrences(wordOccurrences(word))

  def powerset[T](list: List[T]): List[List[T]] = list match {
    case List() => List(Nil)
    case x :: xs => {
      val sub = powerset(xs)
      sub ++ sub.map(y => x :: y)
    }
  }

  def setOfOccurrences(occs: Occurrences): Occurrences =
    for (
      (char, count) <- occs;
      i <- 1 to count
    ) yield (char, i)
  // setOfOccurrences(occs).mkString("\n")

  def setOfOcc2(occs: Occurrences): List[Occurrences] =
    for (occ <- occs) yield setOfOccurrences(List(occ))

  def combinations(occurrences: Occurrences): List[Occurrences] = ???
  // 	powerset(occurrences)

  def combinationsTooMuch(occurrences: Occurrences): List[Occurrences] =
    powerset(setOfOccurrences(occurrences))

  val word = "xxyyyaabcabc"
  val occs = wordOccurrences(word)

  setOfOcc2(occs)
  powerset(List(1, 2, 3))

  val test = List(('a', 2), ('b', 2))
  // combinations(test).mkString("\n")

	powerset(test)
  
  powerset(test).map(x => expand(x)).flatten
  
  def expand(occs: Occurrences): List[Occurrences] = occs match {
  	case List() => List(List())
  	case (char, count)::occs2 => ???
  	}
  	
  /*
  def expand(list: List[Occurrences]): List[Occurrences] = list match {
  	case Nil => Nil
  	case List(Nil) => List(Nil)
  	case List((char, count)::Nil) => for (i <- 1 to count) yield List((char, i))
  	case occ::l2 =>
  }
                                         
 	expand(powerset(test))
  	                   
  	                   */
  powerset(test).map(occs => setOfOcc2(occs)).flatten

  for (
    list <- powerset(test);
    (char, count) <- list;
    i <- 1 to count
  ) yield (char, i)

  val s1 = List(word, word)
  sentenceOccurrences(s1)

  dictionaryByOccurrences take 10

  wordAnagrams("tea")

}