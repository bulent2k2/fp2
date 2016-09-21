package reference

// from week4 Lecture 4.2

trait List2[T] {
  def isEmpty: Boolean
  def head: T
  def tail: List2[T]
  def toString: String
}
case class Nil2[T]() extends List2[T] {
  def isEmpty = true
  def head = throw new NoSuchElementException("Nil.head")
  def tail = throw new NoSuchElementException("Nil.tail")
  override def toString = "."
}
case class Cons2[T](val head: T, val tail: List2[T]) extends List2[T] {
  def isEmpty = false
  override def toString = head.toString + { if (tail.isEmpty) "." else ", " + tail.toString }
}

object List2 {
  def apply[T](x: T) = new Cons2(x, Nil2[T])
  def apply[T]() = Nil2[T]
  def apply[T](x: T, y: T) = new Cons2(x, new Cons2(y, Nil2[T]))
}
