

/**
 * @author shirleyyoung
 */
object andor {
  def and(x : Boolean, y: => Boolean) = 
    if(x) y else false;
  def or(x : Boolean, y: => Boolean) =
    if(x) true else y;
}