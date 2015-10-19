package wk7

object test {
  
  val problem = new Pouring (Vector(4, 7, 9))     //> problem  : wk7.Pouring = wk7.Pouring@59e84876
  //problem.moves
  
  //problem.pathSets.take(3).toList

  problem.solutions(6)                            //> res0: Stream[wk7.test.problem.Path] = Stream(Fill(0) Pour(0,1) Fill(2) Pour(
                                                  //| 2,1) -->Vector(0, 7, 6), ?)
}