package wk6

object iterables {
  val xs = Array(1, 2 , 3,  44)                   //> xs  : Array[Int] = Array(1, 2, 3, 44)
  xs map (x => x * 2)                             //> res0: Array[Int] = Array(2, 4, 6, 88)
  val s = "Hello World"                           //> s  : String = Hello World
  s filter (c => c.isUpper)                       //> res1: String = HW
  val r: Range = 1 until 5                        //> r  : Range = Range(1, 2, 3, 4)
  val s2: Range = 1 to 5                          //> s2  : Range = Range(1, 2, 3, 4, 5)
  val s3: Range=  6 to 1 by -2                    //> s3  : Range = Range(6, 4, 2)
  
  //if there is an element exists that satisfies the predicate
  s exists(c => c.isUpper)                        //> res2: Boolean = true
  s forall(c => c.isUpper)                        //> res3: Boolean = false
  
  val pairs = List(1, 2, 3) zip s                 //> pairs  : List[(Int, Char)] = List((1,H), (2,e), (3,l))
  pairs.unzip                                     //> res4: (List[Int], List[Char]) = (List(1, 2, 3),List(H, e, l))
  s flatMap (c => List(c, '.'))                   //> res5: String = H.e.l.l.o. .W.o.r.l.d.

  (1 to 4) flatMap (x => (1 to 5) map (y => (x, y)))
                                                  //> res6: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((1,1), (1,2
                                                  //| ), (1,3), (1,4), (1,5), (2,1), (2,2), (2,3), (2,4), (2,5), (3,1), (3,2), (3,
                                                  //| 3), (3,4), (3,5), (4,1), (4,2), (4,3), (4,4), (4,5))
  def scalarProduct(xs: Vector[Double], ys: Vector[Double]): Double =
    (xs zip ys) map (xy => xy._1 * xy._2) sum     //> scalarProduct: (xs: Vector[Double], ys: Vector[Double])Double
    // (xs zip ys) map{case(x, y) => x * y} sum
   
   scalarProduct(Vector(1.0, 2.0, 3.0), Vector(1.0, 2.0, 3.0))
                                                  //> res7: Double = 14.0

  def scalarProduct2(xs: Vector[Double], ys: Vector[Double]): Double =
    (for ((x, y) <- xs zip ys) yield x*y) sum     //> scalarProduct2: (xs: Vector[Double], ys: Vector[Double])Double
 }