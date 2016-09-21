package reference

// week 4 -- Objects everywhere
abstract class Boolean2 {
  def ifThenElse[T](t: => T, e: => T): T   // if (cond) te else ee   = >   cond.ifThenElse(te, ee)
  
  def unary_! :Boolean2 = ifThenElse(false2, true2)
  def not :Boolean2 = ifThenElse(false2, true2)
  def and (x: => Boolean2): Boolean2 = ifThenElse(x, false2)
  def  or (x: => Boolean2): Boolean2 = ifThenElse(true2, x)
  // ...
  def ==  (x: Boolean2): Boolean2    = ifThenElse(x, x.not)
  def !=  (x: Boolean2): Boolean2    = ifThenElse(x.not, x)
  // ...
  def < (x: Boolean2)                = ifThenElse(false2, true2)   // false < true
  def toString: String
}

object true2 extends Boolean2 {
    def ifThenElse[T](t: => T, e: => T) = t
    override def toString = "t"
}

object false2 extends Boolean2 {
    def ifThenElse[T](t: => T, e: => T) = e
    override def toString = "f"
}
