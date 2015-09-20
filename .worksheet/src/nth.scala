import wk3_list._
object nth {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(400); 
  //write a function nth that takes an integer n and a list and selects
  //the nth element of the list
  //elements are numberd from 0
  //if index is outside of its length, a IndexOutOfBoundsException should be thrown
  def nth[T] (n: Int, xs: List[T]): T =
   if (xs.isEmpty) throw new IndexOutOfBoundsException
   else if(n == 0) xs.head
   else nth(n - 1, xs.tail);System.out.println("""nth: [T](n: Int, xs: wk3_list.List[T])T""");$skip(63); 
  
  val list = new Cons(1, new Cons(2, new Cons(3, new Nil)));System.out.println("""list  : wk3_list.Cons[Int] = """ + $show(list ));$skip(18); val res$0 = 
  
  nth(2, list);System.out.println("""res0: Int = """ + $show(res$0))}
}
