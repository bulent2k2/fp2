package week4

import huffman._

object tests {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(155); 

  // assignment
  val sampleTree = makeCodeTree(makeCodeTree(Leaf('x', 1), Leaf('e', 1)), Leaf('t', 2));System.out.println("""sampleTree  : week4.Fork = """ + $show(sampleTree ));$skip(45); val res$0 = 

	decode(sampleTree, List(0, 0, 0, 0, 1, 1));System.out.println("""res0: List[Char] = """ + $show(res$0));$skip(37); val res$1 = 
	encode(sampleTree)("eexxtt".toList);System.out.println("""res1: List[week4.huffman.Bit] = """ + $show(res$1));$skip(23); val res$2 = 

  weight(sampleTree);System.out.println("""res2: Int = """ + $show(res$2));$skip(20); val res$3 = 
  chars(sampleTree);System.out.println("""res3: List[Char] = """ + $show(res$3));$skip(28); val res$4 = 
  times("abcxxxcba".toList);System.out.println("""res4: List[(Char, Int)] = """ + $show(res$4));$skip(2080); 

  def test = {
    val frenchCode: CodeTree = Fork(Fork(Fork(Leaf('s', 121895), Fork(Leaf('d', 56269), Fork(Fork(Fork(Leaf('x', 5928), Leaf('j', 8351), List('x', 'j'), 14279), Leaf('f', 16351), List('x', 'j', 'f'), 30630), Fork(Fork(Fork(Fork(Leaf('z', 2093), Fork(Leaf('k', 745), Leaf('w', 1747), List('k', 'w'), 2492), List('z', 'k', 'w'), 4585), Leaf('y', 4725), List('z', 'k', 'w', 'y'), 9310), Leaf('h', 11298), List('z', 'k', 'w', 'y', 'h'), 20608), Leaf('q', 20889), List('z', 'k', 'w', 'y', 'h', 'q'), 41497), List('x', 'j', 'f', 'z', 'k', 'w', 'y', 'h', 'q'), 72127), List('d', 'x', 'j', 'f', 'z', 'k', 'w', 'y', 'h', 'q'), 128396), List('s', 'd', 'x', 'j', 'f', 'z', 'k', 'w', 'y', 'h', 'q'), 250291), Fork(Fork(Leaf('o', 82762), Leaf('l', 83668), List('o', 'l'), 166430), Fork(Fork(Leaf('m', 45521), Leaf('p', 46335), List('m', 'p'), 91856), Leaf('u', 96785), List('m', 'p', 'u'), 188641), List('o', 'l', 'm', 'p', 'u'), 355071), List('s', 'd', 'x', 'j', 'f', 'z', 'k', 'w', 'y', 'h', 'q', 'o', 'l', 'm', 'p', 'u'), 605362), Fork(Fork(Fork(Leaf('r', 100500), Fork(Leaf('c', 50003), Fork(Leaf('v', 24975), Fork(Leaf('g', 13288), Leaf('b', 13822), List('g', 'b'), 27110), List('v', 'g', 'b'), 52085), List('c', 'v', 'g', 'b'), 102088), List('r', 'c', 'v', 'g', 'b'), 202588), Fork(Leaf('n', 108812), Leaf('t', 111103), List('n', 't'), 219915), List('r', 'c', 'v', 'g', 'b', 'n', 't'), 422503), Fork(Leaf('e', 225947), Fork(Leaf('i', 115465), Leaf('a', 117110), List('i', 'a'), 232575), List('e', 'i', 'a'), 458522), List('r', 'c', 'v', 'g', 'b', 'n', 't', 'e', 'i', 'a'), 881025), List('s', 'd', 'x', 'j', 'f', 'z', 'k', 'w', 'y', 'h', 'q', 'o', 'l', 'm', 'p', 'u', 'r', 'c', 'v', 'g', 'b', 'n', 't', 'e', 'i', 'a'), 1486387)
    singleton(List(frenchCode))
    val secret: List[Bit] = List(0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1)

    def decodedSecret: List[Char] = decode(frenchCode, secret)

    decodedSecret
  };System.out.println("""test: => List[Char]""");$skip(7); val res$5 = 
  test;System.out.println("""res5: List[Char] = """ + $show(res$5));$skip(67); 

  val f = string2Chars("abcdxyz").zip(List(1, 3, 5, 7, 6, 4, 2));System.out.println("""f  : List[(Char, Int)] = """ + $show(f ));$skip(25); val res$6 = 
  makeOrderedLeafList(f);System.out.println("""res6: List[week4.Leaf] = """ + $show(res$6));$skip(65); 

  val t1 = Fork(Leaf('a', 2), Leaf('b', 3), List('a', 'b'), 5);System.out.println("""t1  : week4.Fork = """ + $show(t1 ));$skip(107); 
  val t2 = Fork(Fork(Leaf('a', 2), Leaf('b', 3), List('a', 'b'), 5), Leaf('d', 4), List('a', 'b', 'd'), 9);System.out.println("""t2  : week4.Fork = """ + $show(t2 ));$skip(26); val res$7 = 
  encode(t1)("ab".toList);System.out.println("""res7: List[week4.huffman.Bit] = """ + $show(res$7))}
}
