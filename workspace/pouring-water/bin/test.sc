object test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  // pp the pouring problem
  val pp = new PouringOLD(Vector(4, 9))           //> pp  : PouringOLD = PouringOLD@15975490
  // (4, 9), instead of (4, 7) takes a lot longer with original impl (without perf optimization)
  pp.initialState                                 //> res0: scala.collection.immutable.Vector[Int] = Vector(0, 0)

  pp.initialState updated (0, 10)                 //> res1: scala.collection.immutable.Vector[Int] = Vector(10, 0)
  pp.initialState                                 //> res2: scala.collection.immutable.Vector[Int] = Vector(0, 0)
  pp.glasses                                      //> res3: scala.collection.immutable.Range = Range(0, 1)
  pp.moves                                        //> res4: scala.collection.immutable.IndexedSeq[Product with Serializable with t
                                                  //| est.pp.Move] = Vector(Empty(0), Empty(1), Fill(0), Fill(1), Pour(0,1), Pour(
                                                  //| 1,0))

  pp.pathSets.drop(2).take(1).toList.head         //> res5: Set[test.pp.Path] = Set(Fill(0) Fill(1)--> Vector(4, 9), Fill(0) Pour(
                                                  //| 0,1)--> Vector(0, 4), Fill(1) Fill(0)--> Vector(4, 9), Fill(1) Pour(1,0)--> 
                                                  //| Vector(4, 5))

  pp.solution(6).take(3).toList.mkString("\n")    //> res6: String = Fill(1) Pour(1,0) Empty(0) Pour(1,0) Empty(0) Pour(1,0) Fill(
                                                  //| 1) Pour(1,0)--> Vector(4, 6)
                                                  //| Fill(1) Pour(1,0) Empty(0) Pour(1,0) Empty(0) Pour(1,0) Fill(1) Pour(1,0) Em
                                                  //| pty(0)--> Vector(0, 6)

  val p2 = new Pouring(Vector(4, 9, 19))          //> p2  : Pouring = Pouring@c038203
  p2.moves                                        //> res7: scala.collection.immutable.IndexedSeq[Product with Serializable with t
                                                  //| est.p2.Move] = Vector(Empty(0), Empty(1), Empty(2), Fill(0), Fill(1), Fill(2
                                                  //| ), Pour(0,1), Pour(0,2), Pour(1,0), Pour(1,2), Pour(2,0), Pour(2,1))
  p2.solution(17)                                 //> res8: Stream[test.p2.Path] = Stream(Fill(0) Pour(0,2) Fill(0) Pour(0,2) Fill
                                                  //| (1) Pour(1,2)--> Vector(0, 0, 17), ?)

  val p3 = new Pouring(Vector(4, 8, 12, 15))      //> p3  : Pouring = Pouring@6973bf95
  p3.solution(13)                                 //> res9: Stream[test.p3.Path] = Stream(Fill(2) Fill(0) Pour(2,3) Pour(0,3) Pour
                                                  //| (3,2) Empty(3) Pour(0,3) Pour(2,3)--> Vector(0, 0, 0, 13), ?)
}