object nestedfunctions {
  def abs(x: Double) = if (x < 0) -x else x       //> abs: (x: Double)Double
  
def sqrt(x: Double) = {
  def sqrtIter(guess: Double):Double =
    if(isGoodEnough(guess)) guess
    else sqrtIter(improve(guess))
  
  def isGoodEnough(guess: Double) =
    abs(guess * guess - x) / x < 0.001
  
  def improve(guess: Double) =
    (guess + x / guess) / 2
  sqrtIter(1.0)
 }                                                //> sqrt: (x: Double)Double
 sqrt(3)                                          //> res0: Double = 1.7321428571428572
}