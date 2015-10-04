package wk5
import math.Ordering
/**
 * @author shirleyyoung
 */
class mergeSort {
  //passing ord implicitly, leave out extra parameter call
    def msort[T](xs: List[T])(implicit ord: Ordering[T]): List[T] = {
    //def msort[T](xs: List[T])(lt: (T, T) => Boolean): List[T] 
    val n = xs.length / 2
    if (n == 0) xs
    else {
      def merge(xs: List[T], ys: List[T]) : List[T] = (xs, ys) match {
        case (Nil, ys) => ys
        case(xs, Nil) => xs
        case(x :: xs1, y :: ys1) =>
          if (ord.lt(x, y)) x :: merge(xs1,  ys)
          //if (lt(x, y))
          else y :: merge(xs, ys1)
      }
      //Splits this list into two at a given position.
      val (fst, snd) = xs splitAt n
      merge(msort(fst), msort(snd))
      //leaved out merge(msort(fst)(ord), msort(snd)(ord))
    }
   } 
}
