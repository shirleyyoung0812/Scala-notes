package wk7

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(75); 
  
  val problem = new Pouring (Vector(4, 7, 9));System.out.println("""problem  : wk7.Pouring = """ + $show(problem ));$skip(81); val res$0 = 
  //problem.moves
  
  //problem.pathSets.take(3).toList

  problem.solutions(6);System.out.println("""res0: Stream[wk7.test.problem.Path] = """ + $show(res$0))}
}
