import wk3_list._
object nth {
  //write a function nth that takes an integer n and a list and selects
  //the nth element of the list
  //elements are numberd from 0
  //if index is outside of its length, a IndexOutOfBoundsException should be thrown
  def nth[T] (n: Int, xs: List[T]): T =
   if (xs.isEmpty) throw new IndexOutOfBoundsException
   else if(n == 0) xs.head
   else nth(n - 1, xs.tail)                       //> nth: [T](n: Int, xs: wk3_list.List[T])T
  
  val list = new Cons(1, new Cons(2, new Cons(3, new Nil)))
                                                  //> list  : wk3_list.Cons[Int] = wk3_list.Cons@6aaa5eb0
  
  nth(2, list)                                    //> res0: Int = 3
}