package reference

// Peano numbers  Lecture 4.2
abstract class Nat {
  def isZero: Boolean
  def predecessor: Nat
  def successor: Nat = new Succ(this)
  def +(that: Nat): Nat
  def -(that: Nat): Nat
  def toString: String
}

object Zero extends Nat {
  def isZero = true
  def predecessor = throw new Error("0.predecessor")
  def +(that: Nat) = that
  def -(that: Nat) = if (that.isZero) this else throw new Error("0.minus: negative number")
  override def toString = "0"
 }

class Succ(p: Nat) extends Nat {
  def isZero = false
  def predecessor = p
  def +(that: Nat) = new Succ(p + that)
  def -(that: Nat) = if (that.isZero) this else p - that.predecessor
  override def toString = if (p.isZero) "." else "." + p.toString
}
