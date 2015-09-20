object error {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(62); 
  def error(msg: String) = throw new Error(msg);System.out.println("""error: (msg: String)Nothing""");$skip(18); 
  
  val x = null;System.out.println("""x  : Null = """ + $show(x ));$skip(20); 
  val y: String = x;System.out.println("""y  : String = """ + $show(y ));$skip(220); val res$0 = 
  //null is a suptype only of a reference type not a value type
  //both of the values are values of a supertype, AnyVal (Any is a super class of AnyVal)
  //we want to be as specific as possible
 if (true) 1 else false;System.out.println("""res0: AnyVal = """ + $show(res$0))}
}
