object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(57); 
  println("Welcome to the Scala worksheet");$skip(68); 
  // pp the pouring problem
  val pp = new PouringOLD(Vector(4, 9));System.out.println("""pp  : PouringOLD = """ + $show(pp ));$skip(115); val res$0 = 
  // (4, 9), instead of (4, 7) takes a lot longer with original impl (without perf optimization)
  pp.initialState;System.out.println("""res0: scala.collection.immutable.Vector[Int] = """ + $show(res$0));$skip(36); val res$1 = 

  pp.initialState updated (0, 10);System.out.println("""res1: scala.collection.immutable.Vector[Int] = """ + $show(res$1));$skip(18); val res$2 = 
  pp.initialState;System.out.println("""res2: scala.collection.immutable.Vector[Int] = """ + $show(res$2));$skip(13); val res$3 = 
  pp.glasses;System.out.println("""res3: scala.collection.immutable.Range = """ + $show(res$3));$skip(11); val res$4 = 
  pp.moves;System.out.println("""res4: scala.collection.immutable.IndexedSeq[Product with Serializable with test.pp.Move] = """ + $show(res$4));$skip(44); val res$5 = 

  pp.pathSets.drop(2).take(1).toList.head;System.out.println("""res5: Set[test.pp.Path] = """ + $show(res$5));$skip(49); val res$6 = 

  pp.solution(6).take(3).toList.mkString("\n");System.out.println("""res6: String = """ + $show(res$6));$skip(43); 

  val p2 = new Pouring(Vector(4, 9, 19));System.out.println("""p2  : Pouring = """ + $show(p2 ));$skip(11); val res$7 = 
  p2.moves;System.out.println("""res7: scala.collection.immutable.IndexedSeq[Product with Serializable with test.p2.Move] = """ + $show(res$7));$skip(18); val res$8 = 
  p2.solution(17);System.out.println("""res8: Stream[test.p2.Path] = """ + $show(res$8));$skip(47); 

  val p3 = new Pouring(Vector(4, 8, 12, 15));System.out.println("""p3  : Pouring = """ + $show(p3 ));$skip(18); val res$9 = 
  p3.solution(13);System.out.println("""res9: Stream[test.p3.Path] = """ + $show(res$9))}
}
