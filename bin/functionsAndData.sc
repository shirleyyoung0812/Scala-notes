object functionsAndData {

  def addRational(r: Rational, s: Rational): Rational =
    new Rational (
      r.numer * s.denom + s.numer * r.denom,
      r.denom * s.denom)                          //> addRational: (r: Rational, s: Rational)Rational
  def makeString(r: Rational) =
    r.numer + "/" + r.denom                       //> makeString: (r: Rational)String
  makeString(addRational(new Rational(1, 2), new Rational(2, 3)))
                                                  //> res0: String = 7/6
  
  val x = new Rational(1, 3)                      //> x  : Rational = 1/3
  val y = new Rational(5, 7)                      //> y  : Rational = 5/7
  val z = new Rational(3, 2)                      //> z  : Rational = 3/2
  x.numer                                         //> res1: Int = 1
  x.denom                                         //> res2: Int = 3
  x.add(y)                                        //> res3: Rational = 22/21
  x.sub(y).sub(z)                                 //> res4: Rational = -79/42
  y.add(y)                                        //> res5: Rational = 10/7
  x.less(y)                                       //> res6: Boolean = true
  x.max(y)                                        //> res7: Rational = 5/7
  // any method with a parameter can be used like an infix operator
  x add y                                         //> res8: Rational = 22/21
  x < y                                           //> res9: Boolean = true
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