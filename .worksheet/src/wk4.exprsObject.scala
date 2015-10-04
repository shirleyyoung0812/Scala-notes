package wk4

object exprsObject {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(150); 
  def show(e: Expr) = e match {
    case Number(x) => x.toString
    case Sum(l, r) => show(l) + " + " + show(r)
  };System.out.println("""show: (e: wk4.Expr)<error>""")}
}
