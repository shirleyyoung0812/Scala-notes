
package wk4

object ExprShow {
     def show(e: Expr): String = e match {
    case Number(x) => x.toString
    case Var(x) => x
    case Sum(l, r) => show(l) + " + " + show(r)
    case Prod(l, r) => show(l) + " * " + show(r)
  }                                               //> show: (e: wk4.Expr)String
  show(Sum(Prod(Number(2), Var("x")), Var("y")))  //> res0: String = 2 * x + y
  
}