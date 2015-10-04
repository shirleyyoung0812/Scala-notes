

package wk4
/**
 * @author shirleyyoung
 */
/*
 * a type that accepts mutations of its elements should not be covariant, 
 * but immutable types can be covariant, if some conditions on methods are met
 *  if A<:B
 *  C[A] <: C[B] then C covariant, represented as C[+A]
 *  C[A] >: C[B] then contravariant, represented as C[-A]
 *  neither non variant, represented as C[A]
 *  In general, A2 <: A1 and B1 <: B2, 
 *  then A1 => B1 <: A2 => B2
 *  LSP: Functions that use pointers or references to base classes 
 *  must be able to use objects of derived classes without knowing it.
 */
//make List covariant
trait List[+T] {
  def isEmpty: Boolean
  def head: T
  def tail: List[T]
  //violate variance checking rule
  //T covariant
  //List >: Cons
  //def prepend(elem: T): List[T] = new Cons(elem, this)
  def prepend[U >: T] (elem: U): List[U] = new Cons(elem, this)
  //insertion sort
}
// val: is evaluated when the object is first initialized
// def: each time the object is referenced
class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  def isEmpty = false
}

//object cannot have type parameter, single instance
//Nothing is a subtype of anything
object Nil extends List[Nothing] {
  def isEmpty = true
  def head = throw new NoSuchElementException("Nil.head")
  def tail: Nothing = throw new NoSuchElementException("Nil.tail")
}

object test {
  //wk4.List[String] Note: Nothing <: String (and wk4.Nil.type <: wk4.List[Nothing]),
  //but trait List is invariant in type T. You may wish to define T as +T instead. (SLS 4.5)
  //Nothing <: String, and List is covariant
  //then List[Nothing] <: List[String]
  val x: List[String] = Nil 
  


}
