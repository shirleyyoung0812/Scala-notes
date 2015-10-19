package wk7

object pouringTest {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(76); 
  val problem = new Pouring (Vector(4, 7));System.out.println("""problem  : wk7.Pouring = """ + $show(problem ));$skip(16); val res$0 = 
  problem.moves;System.out.println("""res0: scala.collection.immutable.IndexedSeq[Product with Serializable with wk7.pouringTest.problem.Move] = """ + $show(res$0))}
}
object test{
  val game = new Pouring(Vector(4, 7))
}
