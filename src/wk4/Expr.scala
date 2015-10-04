package wk4

/**
 * @author shirleyyoung
 */
trait Expr {
  def eval(e: Expr): Int = e match {
    case Number(n) => n
    case Sum(e1, e2) => eval(e1) + eval(e2)
  }
   def show(e: Expr): String = e match {
    case Number(x) => x.toString
    case Var(x) => x
    case Sum(l, r) => show(l) + " + " + show(r)
    case Prod(l, r) => show(l) + " * " + show(r) 
  }
}

case class Number(n: Int) extends Expr
case class Sum(e1: Expr, e2: Expr) extends Expr
case class Var(x: String) extends Expr
case class Prod(e1: Expr, e2: Expr) extends Expr

