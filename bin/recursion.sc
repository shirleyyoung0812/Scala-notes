object recursion {
     //tail-recursion
     def gcd(a: Int, b: Int): Int =
         if  (b == 0) a else gcd(b, a % b)        //> gcd: (a: Int, b: Int)Int
     //not tail-recursion
     //after factorial(n-1) is called, other operations (n*) need to be performed
     def factorial(n: Int): Int =
         if (n == 0)  1  else n * factorial(n - 1)//> factorial: (n: Int)Int
     
     def factorialTailRecursive(n: Int): Int= {
         def loop(acc: Int, n: Int) : Int =
                if (n == 0) acc
                else loop(acc * n, n - 1)
          loop(1, n)
     }                                            //> factorialTailRecursive: (n: Int)Int
     val a = 1                                    //> a  : Int = 1
     if (a < 4) {
      println("Yeah")
      }                                           //> Yeah
}