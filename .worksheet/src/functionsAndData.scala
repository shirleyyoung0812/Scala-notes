object functionsAndData {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(171); 

  def addRational(r: Rational, s: Rational): Rational =
    new Rational (
      r.numer * s.denom + s.numer * r.denom,
      r.denom * s.denom);System.out.println("""addRational: (r: Rational, s: Rational)Rational""");$skip(60); 
  def makeString(r: Rational) =
    r.numer + "/" + r.denom;System.out.println("""makeString: (r: Rational)String""");$skip(66); val res$0 = 
  makeString(addRational(new Rational(1, 2), new Rational(2, 3)));System.out.println("""res0: String = """ + $show(res$0));$skip(32); 
  
  val x = new Rational(1, 3);System.out.println("""x  : Rational = """ + $show(x ));$skip(29); 
  val y = new Rational(5, 7);System.out.println("""y  : Rational = """ + $show(y ));$skip(29); 
  val z = new Rational(3, 2);System.out.println("""z  : Rational = """ + $show(z ));$skip(10); val res$1 = 
  x.numer;System.out.println("""res1: Int = """ + $show(res$1));$skip(10); val res$2 = 
  x.denom;System.out.println("""res2: Int = """ + $show(res$2));$skip(11); val res$3 = 
  x.add(y);System.out.println("""res3: Rational = """ + $show(res$3));$skip(18); val res$4 = 
  x.sub(y).sub(z);System.out.println("""res4: Rational = """ + $show(res$4));$skip(11); val res$5 = 
  y.add(y);System.out.println("""res5: Rational = """ + $show(res$5));$skip(12); val res$6 = 
  x.less(y);System.out.println("""res6: Boolean = """ + $show(res$6));$skip(11); val res$7 = 
  x.max(y);System.out.println("""res7: Rational = """ + $show(res$7));$skip(78); val res$8 = 
  // any method with a parameter can be used like an infix operator
  x add y;System.out.println("""res8: Rational = """ + $show(res$8));$skip(8); val res$9 = 
  x < y;System.out.println("""res9: Boolean = """ + $show(res$9))}
}

class Rational(x: Int, y: Int) {
  require(y != 0, "denominator must be nonzero")
  
  //constructor
  def this(x: Int) = this(x, 1)
 // def: define a method that returns a function
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  def numer = x / gcd(x, y)
  def denom = y / gcd(x, y)
  // or val numer = x / gcd(x, y), then numer is computed only once
  // be advantageous if the functions numer and denom are called often
  
  def add(that: Rational) =
    new Rational (
      numer * that.denom + that.numer * denom,
       denom * that.denom)
  
  def less(that: Rational) = numer * that.denom < that.numer * denom
  
  def < (that: Rational) = numer * that.denom < that.numer * denom
  
  def max(that: Rational) = if (this.less(that)) that else this
  override def toString = numer + "/" + denom
  /*
  alternatively, we can simplify the rational number in toString function
  def num = x
  def denom = y
  def toString = {
    val g = gcd(x, y)
    numer/g + "/" + denom/g
  }
  client will see different behavior with large integers, e.g., in case overflow
  */
  
  def neg: Rational = new Rational (-numer, denom)
  
  def sub(that: Rational) = add(that.neg)
  def - (that: Rational) = this add that.neg
}
