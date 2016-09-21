

package object week3 {
  abstract class IntSet {
    def incl(x: Int): IntSet
    def contains(x: Int): Boolean
    def union(that: IntSet): IntSet
  }

  class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
    override def toString = "{" + left.toString + elem + right.toString + "}"
    def incl(x: Int): IntSet =
      if (this contains x) this
      else if (x < elem) new NonEmpty(elem, left incl x, right)
      else new NonEmpty(elem, left, right incl x)

    def contains(x: Int): Boolean =
      if (x == elem) true
      else if (x < elem) left contains x
      else right contains x

    def union(that: IntSet): IntSet =
      // how beautiful is this recursion!!
      ((left union right) union that) incl elem

  }

  object Empty extends IntSet {
    def contains(x: Int): Boolean = false
    def incl(x: Int): IntSet = new NonEmpty(x, Empty, Empty)
    override def toString: String = "."
    def union(that: IntSet): IntSet = that
  }
}