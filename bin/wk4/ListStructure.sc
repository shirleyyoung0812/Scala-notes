import scala.List
object ListStructure {

  def insert(x: Int, xs: List[Int]): = xs match {
    case List() => List(x)
    case y :: ys => if (x <=y) x :: xs else y :: insert(x, ys)
  }
  //insertion sort
  def isort(xs: List[Int]): List[Int] = xs match {
    case List() => List()
    case y :: ys => insert(y, isort(ys))
  }
}