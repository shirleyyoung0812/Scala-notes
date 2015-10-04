package wk5

object mergesortObj {
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
   }                                              //> msort: (xs: List[Int])List[Int]
   
   val nums = List(2, -4, 5, 7, 1)                //> nums  : List[Int] = List(2, -4, 5, 7, 1)
   msort(nums)                                    //> res0: List[Int] = List(-4, 1, 2, 5, 7)
   val fruits = List("apple", "pineapple", "orange", "banana")
                                                  //> fruits  : List[String] = List(apple, pineapple, orange, banana)
   val ms = new mergeSort                         //> ms  : wk5.mergeSort = wk5.mergeSort@402f32ff
   ms.msort(fruits)                               //> res1: List[String] = List(apple, banana, orange, pineapple)
   
}