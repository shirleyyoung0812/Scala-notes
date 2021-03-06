package wk6

object nqueens {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(647); 
  def queens(n: Int): Set[List[Int]] = {
    def placeQueens(k: Int): Set[List[Int]] = {
      if (k == 0) Set(List())
      else
        for {
          queens <- placeQueens(k - 1)
          col <- 0 until n
          if isSafe(col, queens)
        } yield col :: queens
    }
    
    def isSafe(col: Int, queens: List[Int]): Boolean = {
      val row = queens.length
      //add row to each column and form a coordinate pair
      val queensWithRow = ( row - 1 to 0 by -1) zip queens
      queensWithRow forall {
        case (r, c) => col != c && math.abs(col - c) != row - r
      }
    }
    placeQueens(n)
  };System.out.println("""queens: (n: Int)Set[List[Int]]""");$skip(421); 
  
  //later queens come first(row 3, 2, 1, 0)
  //use a vector and fill with "* "
  //update the element of index "col" with "X "
  //Displays all elements of this traversable or iterator in a string using a separator string.
  def show(queens: List[Int]) = {
    val lines =
      for (col <- queens.reverse)
      yield Vector.fill(queens.length)("* ").updated(col, "X ").mkString
    "\n" + (lines mkString "\n")
  };System.out.println("""show: (queens: List[Int])String""");$skip(41); val res$0 = 
  
  (queens(8)  map show) mkString "\n";System.out.println("""res0: String = """ + $show(res$0))}
}
