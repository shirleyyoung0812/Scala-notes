object higherOrder {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(191); 
  def sum(f: Int => Int, a: Int, b: Int) : Int = {
    def loop(a: Int, rst: Int): Int = {
      if(a > b) rst
      else loop(a + 1, f(a) + rst)
    }
    loop(a, 0)
  };System.out.println("""sum: (f: Int => Int, a: Int, b: Int)Int""");$skip(24); val res$0 = 
  sum(x => x * x, 3, 5);System.out.println("""res0: Int = """ + $show(res$0))}
}
