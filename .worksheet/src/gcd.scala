object gcd {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(91); 
     def gcd(a: Int, b: Int): Int =
         if  (b == 0) a else gcd(b, a % b);System.out.println("""gcd: (a: Int, b: Int)Int""");$skip(17); val res$0 = 
     gcd(21, 14);System.out.println("""res0: Int = """ + $show(res$0));$skip(91); 
     
     def factorial(n: Int): Int =
         if (n == 0)  1  else n * factorial(n - 1);System.out.println("""factorial: (n: Int)Int""");$skip(24); val res$1 = 
     
     factorial(4);System.out.println("""res1: Int = """ + $show(res$1))}
}
