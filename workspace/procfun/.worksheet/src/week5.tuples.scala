package week5

object tuples {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(61); 

  val pair = ("answer", 42);System.out.println("""pair  : (String, Int) = """ + $show(pair ));$skip(115); 

  // pattern match! (This is actually a call to the constructor for the  Tuple class!)
  
  val (fst, snd) = pair;System.out.println("""fst  : String = """ + $show(fst ));System.out.println("""snd  : Int = """ + $show(snd ));$skip(68); 

	// or use member vals: _1, _2, etc..
	val triple = ("x", 5, 1e25);System.out.println("""triple  : (String, Int, Double) = """ + $show(triple ));$skip(11); val res$0 = 
	triple._3;System.out.println("""res0: Double = """ + $show(res$0))}
}

	