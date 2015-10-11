package wk6

object pairs {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(39); 
  val n = 7;System.out.println("""n  : Int = """ + $show(n ));$skip(68); 
 val xxs = (1 until n) map (i =>
    (1 until i) map (j => (i, j)));System.out.println("""xxs  : scala.collection.immutable.IndexedSeq[scala.collection.immutable.IndexedSeq[(Int, Int)]] = """ + $show(xxs ));$skip(67); val res$0 = 
  (1 until n) map (i =>
    (1 until i) map (j => (i, j))) flatten;System.out.println("""res0: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$0));$skip(117); 
  //or (xss foldRight Seq[Int]())(_++_)
  
  def isPrime(n: Int): Boolean =
    (2 until n) forall (d => n % d != 0);System.out.println("""isPrime: (n: Int)Boolean""");$skip(117); val res$1 = 
  
  (1 until n) flatMap (i =>
    (1 until i) map (j => (i, j)))  filter (pair =>
      isPrime(pair._1 + pair._2));System.out.println("""res1: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$1));$skip(105); val res$2 = 
    
    
    for {
      i <- 1 until n
      j <- 1 until i
      if isPrime(i + j)
    } yield (i, j);System.out.println("""res2: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$2))}
}
