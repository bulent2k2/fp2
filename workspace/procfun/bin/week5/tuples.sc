package week5

object tuples {

  val pair = ("answer", 42)                       //> pair  : (String, Int) = (answer,42)

  // pattern match! (This is actually a call to the constructor for the  Tuple class!)
  
  val (fst, snd) = pair                           //> fst  : String = answer
                                                  //| snd  : Int = 42

	// or use member vals: _1, _2, etc..
	val triple = ("x", 5, 1e25)               //> triple  : (String, Int, Double) = (x,5,1.0E25)
	triple._3                                 //> res0: Double = 1.0E25
}

	