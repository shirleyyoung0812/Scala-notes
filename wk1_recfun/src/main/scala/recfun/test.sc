package recfun

object test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  import Main.balance
  balance("(if (zero? x) max (/ 1 x))".toList)    //> res0: Boolean = true
  balance("I told him (that it's not (yet) done).\n(But he wasn't listening)".toList)
                                                  //> res1: Boolean = true
  !balance(":-)".toList)                          //> res2: Boolean = true
  !balance("())(".toList)                         //> res3: Boolean = true
  import Main.countChange
  countChange(4,List(1,2))                        //> res4: Int = 3
  countChange(300,List(5,10,20,50,100,200,500))   //> res5: Int = 1022
  countChange(301,List(5,10,20,50,100,200,500))   //> res6: Int = 0
  countChange(300,List(500,5,50,100,20,200,10))   //> res7: Int = 1022
  import Main.pascal
  pascal(0,2)                                     //> res8: Int = 1
  pascal(1,2)                                     //> res9: Int = 2
  pascal(1,3)                                     //> res10: Int = 3
  
  
}