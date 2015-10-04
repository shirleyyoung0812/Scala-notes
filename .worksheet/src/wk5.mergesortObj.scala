package wk5

object mergesortObj {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(526); 
  def msort(xs: List[Int]): List[Int] = {
    val n = xs.length / 2
    if (n == 0) xs
    else {
      def merge(xs: List[Int], ys: List[Int]) : List[Int] = (xs, ys) match {
        case (Nil, ys) => ys
        case(xs, Nil) => xs
        case(x :: xs1, y :: ys1) =>
          if (x <= y) x :: merge(xs1,  ys)
          else y :: merge(xs, ys1)
      }
      //Splits this list into two at a given position.
      val (fst, snd) = xs splitAt n
      merge(msort(fst), msort(snd))
    }
   };System.out.println("""msort: (xs: List[Int])List[Int]""");$skip(39); 
   
   val nums = List(2, -4, 5, 7, 1);System.out.println("""nums  : List[Int] = """ + $show(nums ));$skip(15); val res$0 = 
   msort(nums);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(63); 
   val fruits = List("apple", "pineapple", "orange", "banana");System.out.println("""fruits  : List[String] = """ + $show(fruits ));$skip(26); 
   val ms = new mergeSort;System.out.println("""ms  : wk5.mergeSort = """ + $show(ms ));$skip(20); val res$1 = 
   ms.msort(fruits);System.out.println("""res1: List[String] = """ + $show(res$1))}
   
}
