package week4

trait Expr
case class Number(n: Int) extends Expr
case class Sum(e1: Expr, e2: Expr) extends Expr


object exprs {

/*
	def show(e: Expr): String = e match {
		case Number(x) => x.toString
		case Sum(l, r) => show(l) + " + " show(r)
	}
	
	show(Sum(Number(1), Number(4)))
	*/
	
	def insert(x: Int, xs: List[Int]): List[Int] = xs match {
		case List() => x::Nil
		case y::ys => if (x <= y) x :: xs else y :: insert(x, ys)
	}

	insert(1, List(0, 2, 3, 4))
	insert(5, List(0, 3, 5, 8, 10))
	insert(5, List(0, 3))
	
}
