import wk7._
object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(75); 
  
  val problem = new Pouring (Vector(4, 7, 9));System.out.println("""problem  : wk7.Pouring = """ + $show(problem ));$skip(16); val res$0 = 
  problem.moves;System.out.println("""res0: scala.collection.immutable.IndexedSeq[Product with Serializable with test.problem.Move] = """ + $show(res$0))}
}
