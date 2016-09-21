package reference

// decomposition! Find a general and convenient way to access objects in an extensible class hierarchy
//   Pattern Matching! (case class) instead of just (class)
// btw. why the need to decompose? Because we like to compose (:-). E.g., s1 = Sum(e1, e2). Now recover from s1, the e1 and e2
trait Expr {
  def isNumber: Boolean
  def isSum: Boolean
  def numValue: Int
  def leftOp: Expr
  def rightOp: Expr
  def eval: Int   // this is  without pattern matching...
  def show: String
  def eval2(): Int = this match {
    case Number(n)   => n
    case Sum(e1, e2) => e1.eval2 + e2.eval2
  }
  def show2(): String = this match {
    case Number(n)    => n.toString
    case Sum(e1, e2) => "(" + e1.show2 + " + " + e2.show2 + ")"
  }
}

// case also implicitly defines "companion objects" with apply methods:
// object Number { def apply(n: Int) = new Number(n) }
// object Sum { def apply(e1: Expr, e2: Expr) = new Sum(e1, e2)
// so, we no longer need "new" in (new Number(1)), just do: Number(1)
case class Number(n: Int) extends Expr {
  def eval: Int = n
  def isNumber = true
  def isSum = false
  def numValue = n
  def leftOp = throw new Error("Number.leftOp")
  def rightOp = throw new Error("Number.rightOp")
  def show = n.toString
}

case class Sum(e1: Expr, e2: Expr) extends Expr {
  def eval: Int = e1.eval + e2.eval
  def isNumber = false
  def isSum = true
  def numValue = throw new Error("Sum.numValue")
  def leftOp = e1
  def rightOp = e2
  def show = e1.show + " + " + e2.show
}
