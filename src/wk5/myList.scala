package wk5

/**
 * @author shirleyyoung
 */
abstract class myList[T] {
  /*def map[U] (f: T => U): List[U] = this match {
    case Nil => this
    case x :: xs => f(x) :: xs.map(f)
  }
  def filter(p: T => Boolean): List[T ] = this match {
    case Nil => this
    case x :: xs => if (p(x)) x :: xs.filter(p) else xs.filter(p)
  }*/
  /*def reduceLeft(op: (T, T) => T): T = this match {
    case Nil => throw new Error("Nil.reduceLeft")
    case x :: xs => (xs foldLeft x)(op)
  }
  
  def foldLeft[U](z: U)(op: (U, T) => U): U this match {
    case Nil => z
    case x :: xs => (xs foldLeft op(z, x))(op)
  }*/
  
  /*def reduceRight(op: (T, T) => T): T = this match {
    case Nil => throw new Error("Nil.reduceRight")
    case x :: Nil => x
    case x :: xs => op(x,xs.reduceRight(op))
  }
  
  def foldRight[U](z: U)(op: (T, U) => U): U = this match {
    case Nil => z
    case x :: xs => op(x, (xs foldRight z)(op))
  }*/
  
  def concat[T](xs: List[T], ys: List[T]): List[T] = 
    (xs foldRight ys)(_::_)
}