object des {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(85);  // discrete event simulation
  println("Welcome to the Scala worksheet")

  object sim extends Circuits with Parameters
  import sim._;$skip(100); 
  val in1, in2, sum, carry = new Wire;System.out.println("""in1  : des.sim.Wire = """ + $show(in1 ));System.out.println("""in2  : des.sim.Wire = """ + $show(in2 ));System.out.println("""sum  : des.sim.Wire = """ + $show(sum ));System.out.println("""carry  : des.sim.Wire = """ + $show(carry ));$skip(36); 
 
  halfAdder(in1, in2, sum, carry);$skip(20); 
  probe("sum", sum);$skip(24); 
  probe("carry", carry)}

}
