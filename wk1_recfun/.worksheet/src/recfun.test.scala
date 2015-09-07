package recfun

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(73); 
  println("Welcome to the Scala worksheet")
  import Main.balance;$skip(69); val res$0 = 
  balance("(if (zero? x) max (/ 1 x))".toList);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(86); val res$1 = 
  balance("I told him (that it's not (yet) done).\n(But he wasn't listening)".toList);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(25); val res$2 = 
  !balance(":-)".toList);System.out.println("""res2: Boolean = """ + $show(res$2));$skip(26); val res$3 = 
  !balance("())(".toList)
  import Main.countChange;System.out.println("""res3: Boolean = """ + $show(res$3));$skip(53); val res$4 = 
  countChange(4,List(1,2));System.out.println("""res4: Int = """ + $show(res$4));$skip(48); val res$5 = 
  countChange(300,List(5,10,20,50,100,200,500));System.out.println("""res5: Int = """ + $show(res$5));$skip(48); val res$6 = 
  countChange(301,List(5,10,20,50,100,200,500));System.out.println("""res6: Int = """ + $show(res$6));$skip(48); val res$7 = 
  countChange(300,List(500,5,50,100,20,200,10))
  import Main.pascal;System.out.println("""res7: Int = """ + $show(res$7));$skip(35); val res$8 = 
  pascal(0,2);System.out.println("""res8: Int = """ + $show(res$8));$skip(14); val res$9 = 
  pascal(1,2);System.out.println("""res9: Int = """ + $show(res$9));$skip(14); val res$10 = 
  pascal(1,3);System.out.println("""res10: Int = """ + $show(res$10))}
  
  
}
