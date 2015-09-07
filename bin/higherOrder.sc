object higherOrder {
  def sum(f: Int => Int, a: Int, b: Int) : Int = {
    def loop(a: Int, rst: Int): Int = {
      if(a > b) rst
      else loop(a + 1, f(a) + rst)
    }
    loop(a, 0)
  }                                               //> sum: (f: Int => Int, a: Int, b: Int)Int
  sum(x => x * x, 3, 5)                           //> res0: Int = 50
}