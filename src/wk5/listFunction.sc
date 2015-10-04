package wk5

object listFunction {



  val nums = List(2, -4, 5, 7, 1)                 //> nums  : List[Int] = List(2, -4, 5, 7, 1)
  val fruits = List("apple", "pineapple", "orange", "banana")
                                                  //> fruits  : List[String] = List(apple, pineapple, orange, banana)
  
  nums filter (x => x > 0)                        //> res0: List[Int] = List(2, 5, 7, 1)
  nums filterNot(x => x > 0)                      //> res1: List[Int] = List(-4)
  nums partition(x => x > 0)                      //> res2: (List[Int], List[Int]) = (List(2, 5, 7, 1),List(-4))
  
 //longest prefix
  nums takeWhile (x => x > 0)                     //> res3: List[Int] = List(2)
  
  //the rest of the list
  nums dropWhile(x => x > 0)                      //> res4: List[Int] = List(-4, 5, 7, 1)
  nums span(x => x > 0)                           //> res5: (List[Int], List[Int]) = (List(2),List(-4, 5, 7, 1))
 
 
 def pack[T](xs: List[T]):  List[List[T]] = xs match {
  case Nil => Nil
  case x :: xs1 =>
    val (first, rest) = xs span(y => y == x)
    first :: pack(rest)
 }                                                //> pack: [T](xs: List[T])List[List[T]]
 
 def encode[T] (xs: List[T]): List[(T, Int)] =
  pack(xs) map (ys => (ys.head, ys.length))       //> encode: [T](xs: List[T])List[(T, Int)]
  
  val data = List("a", "a", "a", "b", "c", "c", "a")
                                                  //> data  : List[String] = List(a, a, a, b, c, c, a)
  pack(data)                                      //> res6: List[List[String]] = List(List(a, a, a), List(b), List(c, c), List(a))
                                                  //| 
  encode(data)                                    //> res7: List[(String, Int)] = List((a,3), (b,1), (c,2), (a,1))
  
  nums reduceLeft (_+_)                           //> res8: Int = 11
  def sum(xs: List[Int]) = 0 :: xs reduceLeft(_+_)//> sum: (xs: List[Int])Int
  def product(xs: List[Int]) = 1 :: xs reduceLeft(_*_)
                                                  //> product: (xs: List[Int])Int
  def sum2(xs: List[Int]) = (xs foldLeft 0) (_+_) //> sum2: (xs: List[Int])Int
  def product2(xs: List[Int])  = (xs foldLeft 1)(_*_)
                                                  //> product2: (xs: List[Int])Int
}