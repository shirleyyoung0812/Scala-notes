package wk6

object iterables {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(63); 
  val xs = Array(1, 2 , 3,  44);System.out.println("""xs  : Array[Int] = """ + $show(xs ));$skip(22); val res$0 = 
  xs map (x => x * 2);System.out.println("""res0: Array[Int] = """ + $show(res$0));$skip(24); 
  val s = "Hello World";System.out.println("""s  : String = """ + $show(s ));$skip(28); val res$1 = 
  s filter (c => c.isUpper);System.out.println("""res1: String = """ + $show(res$1));$skip(27); 
  val r: Range = 1 until 5;System.out.println("""r  : Range = """ + $show(r ));$skip(25); 
  val s2: Range = 1 to 5;System.out.println("""s2  : Range = """ + $show(s2 ));$skip(31); 
  val s3: Range=  6 to 1 by -2;System.out.println("""s3  : Range = """ + $show(s3 ));$skip(93); val res$2 = 
  
  //if there is an element exists that satisfies the predicate
  s exists(c => c.isUpper);System.out.println("""res2: Boolean = """ + $show(res$2));$skip(27); val res$3 = 
  s forall(c => c.isUpper);System.out.println("""res3: Boolean = """ + $show(res$3));$skip(37); 
  
  val pairs = List(1, 2, 3) zip s;System.out.println("""pairs  : List[(Int, Char)] = """ + $show(pairs ));$skip(14); val res$4 = 
  pairs.unzip;System.out.println("""res4: (List[Int], List[Char]) = """ + $show(res$4));$skip(32); val res$5 = 
  s flatMap (c => List(c, '.'));System.out.println("""res5: String = """ + $show(res$5));$skip(54); val res$6 = 

  (1 to 4) flatMap (x => (1 to 5) map (y => (x, y)));System.out.println("""res6: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$6));$skip(116); 
  def scalarProduct(xs: Vector[Double], ys: Vector[Double]): Double =
    (xs zip ys) map (xy => xy._1 * xy._2) sum;System.out.println("""scalarProduct: (xs: Vector[Double], ys: Vector[Double])Double""");$skip(115); val res$7 = 
    // (xs zip ys) map{case(x, y) => x * y} sum
   
   scalarProduct(Vector(1.0, 2.0, 3.0), Vector(1.0, 2.0, 3.0));System.out.println("""res7: Double = """ + $show(res$7));$skip(118); 

  def scalarProduct2(xs: Vector[Double], ys: Vector[Double]): Double =
    (for ((x, y) <- xs zip ys) yield x*y) sum;System.out.println("""scalarProduct2: (xs: Vector[Double], ys: Vector[Double])Double""")}
 }
