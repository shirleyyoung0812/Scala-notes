package wk6

object maps {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(83); 
  val romanNumerals = Map("I" -> 1, "V" -> 5, "X" -> 10);System.out.println("""romanNumerals  : scala.collection.immutable.Map[String,Int] = """ + $show(romanNumerals ));$skip(79); 
  
  val capitalOfCountry = Map("US" -> "Washington", "Switzerland" -> "Bern");System.out.println("""capitalOfCountry  : scala.collection.immutable.Map[String,String] = """ + $show(capitalOfCountry ));$skip(39); val res$0 = 
  
  
  capitalOfCountry get "andorra";System.out.println("""res0: Option[String] = """ + $show(res$0));$skip(28); val res$1 = 
  capitalOfCountry get "US";System.out.println("""res1: Option[String] = """ + $show(res$1));$skip(145); 
  def showCapital(country: String) = capitalOfCountry.get(country) match {
    case Some(capital) => capital
    case None => "missing data"
  };System.out.println("""showCapital: (country: String)String""");$skip(25); val res$2 = 
  showCapital("Andorra");System.out.println("""res2: String = """ + $show(res$2))}
}
