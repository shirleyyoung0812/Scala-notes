object recursion {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(119); 
     //tail-recursion
     def gcd(a: Int, b: Int): Int =
         if  (b == 0) a else gcd(b, a % b);System.out.println("""gcd: (a: Int, b: Int)Int""");$skip(193); 
     //not tail-recursion
     //after factorial(n-1) is called, other operations (n*) need to be performed
     def factorial(n: Int): Int =
         if (n == 0)  1  else n * factorial(n - 1);System.out.println("""factorial: (n: Int)Int""");$skip(200); 
     
     def factorialTailRecursive(n: Int): Int= {
         def loop(acc: Int, n: Int) : Int =
                if (n == 0) acc
                else loop(acc * n, n - 1)
          loop(1, n)
     };System.out.println("""factorialTailRecursive: (n: Int)Int""");$skip(15); 
     val a = 1;System.out.println("""a  : Int = """ + $show(a ));$skip(48); 
     if (a < 4) {
      println("Yeah")
      }}
}
