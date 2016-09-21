object des { // discrete event simulation
  println("Welcome to the Scala worksheet")

  object sim extends Circuits with Parameters
  import sim._
  val in1, in2, sum, carry = new Wire
 
  halfAdder(in1, in2, sum, carry)
  probe("sum", sum)
  probe("carry", carry)

}