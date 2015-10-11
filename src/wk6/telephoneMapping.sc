package wk6

import scala.io.Source
object telephoneMapping {
  val in = Source.fromURL("http://lamp.epfl.ch/files/content/sites/lamp/files/teaching/progfun/linuxwords")
                                                  //> java.io.FileNotFoundException: http://lamp.epfl.ch/files/content/sites/lamp/
                                                  //| files/teaching/progfun/linuxwords
                                                  //| 	at sun.net.www.protocol.http.HttpURLConnection.getInputStream0(HttpURLCo
                                                  //| nnection.java:1834)
                                                  //| 	at sun.net.www.protocol.http.HttpURLConnection.getInputStream(HttpURLCon
                                                  //| nection.java:1439)
                                                  //| 	at java.net.URL.openStream(URL.java:1038)
                                                  //| 	at scala.io.Source$.fromURL(Source.scala:141)
                                                  //| 	at scala.io.Source$.fromURL(Source.scala:131)
                                                  //| 	at wk6.telephoneMapping$$anonfun$main$1.apply$mcV$sp(wk6.telephoneMappin
                                                  //| g.scala:5)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at wk6.telephoneMapping$.main(wk6.telephoneMapping.scala:4)
                                                  //| 	at wk6.telephoneMapping
                                                  //| Output exceeds cutoff limit.
  
  val words = in.getLines.toList filter (word => word forall (chr => chr.isLetter))
 /** Invert the mnem map to give a map from chars 'A' ... 'Z' to '2' ... '9' **/
  val mnem = Map(
    '2' -> "ABC", '3' -> "DEF", '4' -> "GHI", '5' -> "JKL",
    '6' -> "MNO", '7' -> "PQRS", '8' -> "TUV", '9' -> "WXYZ")
  val charCode: Map[Char, Char] =
    for ((digit, str) <- mnem; ltr <- str) yield ltr -> digit
    
   /** Map a word to the digit string it can represent**/
  def wordCode(word: String): String =
    word.toUpperCase map charCode
 
  val wordsForNum: Map[String, Seq[String]] =
      words groupBy wordCode withDefaultValue Seq()
 
 
 
  def encode(number: String): Set[List[String]] =
    if (number.isEmpty) Set(List())
    else {
        for {
          split <- 1 to number.length
          word <- wordsForNum(number take split)
          rest <- encode(number drop split)
        }   yield word :: rest
       }.toSet
  
  def translate(number: String): Set[String] =
    encode(number) map(_ mkString " ")
  
  
  
  wordCode("JAVA")
    /**
    * A map from digit strings to the words that represent them
    * e.g., "5282" -> List("Java", "Kata", "Lava", ...)
    */

}