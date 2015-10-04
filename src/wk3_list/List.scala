

package wk3_list
/**
 * @author shirleyyoung
 */
/* cons-lists: immutable linked list
 * constructed from:
 * 1.Nil the empty list
 * 2. Cons a cell containing an element and the remainder of the list
 */
trait List[T] {
  def isEmpty: Boolean
  def head: T
  def tail: List[T]
}
// val: is evaluated when the object is first initialized
// def: each time the object is referenced
class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  def isEmpty = false
}

class Nil[T] extends List[T] {
  def isEmpty = true
  def head = throw new NoSuchElementException("Nil.head")
  def tail: Nothing = throw new NoSuchElementException("Nil.tail")
}

//type erasure: all type parameters and type arguments are removed before evaluating the program

//create functions in object List so that users can create lists of length 0-2 with syntax
//List()
//List(1)
//List(2)
object List {
  // List(1, 2) = List.apply(1, 2)
  def apply[T] (x1: T, x2: T): List[T] = new Cons(x1, new Cons(x2, new Nil))
  def apply[T]() = new Nil
  def apply[T](x1: T): List[T] = new Cons(x1, new Nil)
}
