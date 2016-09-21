package object week2 {
  
  // developed and tested in xFinal1.sc
  
  class Rational(x: Int, y: Int) {
    def this(a: Int) = this(a, 1)

    require(y > 0, "denominator must be positive")
    private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
    private val g = gcd(math.abs(x), y)

    val numer = x / g
    val denom = y / g
    assert(denom > 0, "denom is still negative or zero")

    override def toString: String = numer + "/" + denom

    def max(that: Rational) = if (this < that) that else this
    def <(that: Rational) = this.numer * that.denom < that.numer * this.denom
    def +(r: Rational) = new Rational(numer * r.denom + r.numer * denom, denom * r.denom)
    def *(r: Rational) = new Rational(numer * r.numer, denom * r.denom)
    def -(r: Rational) = this + r * new Rational(-1, 1)
    def unary_- = this * new Rational(-1, 1)
  }
}

