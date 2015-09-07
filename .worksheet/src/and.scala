object and {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(56); 
  println("Welcome to the Scala worksheet");$skip(63); 
  def and(x : Boolean, y: => Boolean) =
    if(x) y else false;System.out.println("""and: (x: Boolean, y: => Boolean)Boolean""");$skip(27); 
  val loop: Boolean = loop;System.out.println("""loop  : Boolean = """ + $show(loop ));$skip(18); val res$0 = 
  and(true, loop);System.out.println("""res0: Boolean = """ + $show(res$0))}
}
