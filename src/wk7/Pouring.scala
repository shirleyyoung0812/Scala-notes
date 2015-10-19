package wk7

/**
 * @author shirleyyoung
 * generate all possible moves
 * until we get the solution
 * 
 */
class Pouring (capacity: Vector[Int]){
  
  // States: for each glass (Glass) how much water is in
  //size of state is number of glasses, value represents the volume
  //of the water in that glass
  type State = Vector[Int]
  val initialState = capacity map(x => 0)
  
  //Moves
  trait Move {
    //take a state and return a new state
    def change(state: State): State
  }
  //empty the glass
  case class Empty(glass: Int) extends Move {
    //updated: a copy of the list with one single replaced element
    def change(state: State) = state updated (glass, 0)
  }
  //fill the glass from source
  case class Fill(glass:Int) extends Move {
    def change(state: State) = state updated(glass, capacity(glass))
  }
  //pour from one glass to another
  case class Pour(from: Int, to: Int) extends Move {
    def change(state: State) = {
      val amount = state(from) min (capacity(to) - state(to))
      state updated (from, state(from) - amount) updated(to, state(to) + amount)
    }
  }
  //all glasses
  val glasses = 0 until capacity.length
  
  // all possible moves
  val moves = 
     (for (g <- glasses) yield Empty(g)) ++
     (for (g <- glasses) yield Fill(g)) ++
     (for (from <- glasses; to <- glasses if from != to) yield Pour(from, to))
   
  // Paths: sequence of moves
  //endState: current state
  class Path(history: List[Move], val endState: State){
    /*def endState: State = trackState(history)
    private def trackState(xs: List[Move]): State = xs match {
      case Nil => initialState
      case move :: xs1 => move change trackState(xs1)
    }*/
    // extend another move
    //new endState: move that affects the old endState
    def extend(move: Move) = new Path(move :: history, move change endState)
    override def toString = (history.reverse mkString " ") + " -->" + endState
  }
  
  val initialPath = new Path(Nil, initialState)
  //explored: the states that have been visited
  def from(paths: Set[Path], explored: Set[State]): Stream[Set[Path]] =
    if (paths.isEmpty) Stream.empty
    //generate all the possible new paths
    else {
      val more = for {
        path <- paths
        //nex path by extending current path
        //for all possible moves
        next <- moves map path.extend
        if !(explored contains next.endState)
      } yield next
      paths #:: from(more, explored ++(more map(_.endState)))
     }
  
  //all possible paths
  //the first element gives the initial path set
  //the set of all possible paths at length 1
  val pathSets = from(Set(initialPath), Set(initialState))
  
  //the volume we want to see in one of glasses
  def solutions(target: Int): Stream[Path] =
    for {
      pathSet <- pathSets
      path <- pathSet
      if path.endState contains target
    } yield path
}


