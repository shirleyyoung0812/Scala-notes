package wk6

object polynomials {
  class Poly(val terms0: Map[Int, Double]) {
    //*repeated number, means we can parse an arbitary number of
    //parameters
    def this(bindings: (Int, Double)*)
      = this(bindings.toMap)
  
    val terms = terms0 withDefaultValue(0.0)
    def + (other: Poly) = new Poly(terms ++ other.terms map adjust)
    
    //more efficient than ++
    def add(other: Poly) = new Poly((other.terms foldLeft terms)(addTerm))
    def addTerm(terms: Map[Int, Double], term: (Int, Double)): Map[Int, Double] = {
      val (exp, coeff) = term
      terms + (exp -> (coeff + terms(exp)))
    }
    def adjust(term: (Int, Double)): (Int, Double) = {
      val (exp, coeff) =term
      exp -> (coeff + terms(exp))
    }
    
    override def toString =
    (for ((exp, coeff) <- terms.toList.sorted.reverse) yield coeff + "x^" + exp) mkString " + "
  };import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(926); 
  
  val p1 = new Poly(1 -> 2.0, 3-> 4.0, 5 -> 6.2);System.out.println("""p1  : wk6.polynomials.Poly = """ + $show(p1 ));$skip(40); 
  val p2 = new Poly(0 -> 3.0, 3 -> 7.0);System.out.println("""p2  : wk6.polynomials.Poly = """ + $show(p2 ));$skip(13); val res$0 = 
  
  p1 + p2;System.out.println("""res0: wk6.polynomials.Poly = """ + $show(res$0))}
 }
