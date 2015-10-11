package wk6

object maps {
  val romanNumerals = Map("I" -> 1, "V" -> 5, "X" -> 10)
                                                  //> romanNumerals  : scala.collection.immutable.Map[String,Int] = Map(I -> 1, V -
                                                  //| > 5, X -> 10)
  
  val capitalOfCountry = Map("US" -> "Washington", "Switzerland" -> "Bern")
                                                  //> capitalOfCountry  : scala.collection.immutable.Map[String,String] = Map(US -
                                                  //| > Washington, Switzerland -> Bern)
  
  
  capitalOfCountry get "andorra"                  //> res0: Option[String] = None
  capitalOfCountry get "US"                       //> res1: Option[String] = Some(Washington)
  def showCapital(country: String) = capitalOfCountry.get(country) match {
    case Some(capital) => capital
    case None => "missing data"
  }                                               //> showCapital: (country: String)String
  showCapital("Andorra")                          //> res2: String = missing data
}