package wk6

import scala.io.Source
object telephoneMapping {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(169); 
  val in = Source.fromURL("http://lamp.epfl.ch/files/content/sites/lamp/files/teaching/progfun/linuxwords");System.out.println("""in  : scala.io.BufferedSource = """ + $show(in ));$skip(87); 
  
  val words = in.getLines.toList filter (word => word forall (chr => chr.isLetter));System.out.println("""words  : List[String] = """ + $show(words ));$skip(221); 
 /** Invert the mnem map to give a map from chars 'A' ... 'Z' to '2' ... '9' **/
  val mnem = Map(
    '2' -> "ABC", '3' -> "DEF", '4' -> "GHI", '5' -> "JKL",
    '6' -> "MNO", '7' -> "PQRS", '8' -> "TUV", '9' -> "WXYZ");System.out.println("""mnem  : scala.collection.immutable.Map[Char,String] = """ + $show(mnem ));$skip(96); 
  val charCode: Map[Char, Char] =
    for ((digit, str) <- mnem; ltr <- str) yield ltr -> digit;System.out.println("""charCode  : Map[Char,Char] = """ + $show(charCode ));$skip(136); 
    
   /** Map a word to the digit string it can represent**/
  def wordCode(word: String): String =
    word.toUpperCase map charCode;System.out.println("""wordCode: (word: String)String""");$skip(100); 
 
  val wordsForNum: Map[String, Seq[String]] =
      words groupBy wordCode withDefaultValue Seq();System.out.println("""wordsForNum  : Map[String,Seq[String]] = """ + $show(wordsForNum ));$skip(294); 
 
 
 
  def encode(number: String): Set[List[String]] =
    if (number.isEmpty) Set(List())
    else {
        for {
          split <- 1 to number.length
          word <- wordsForNum(number take split)
          rest <- encode(number drop split)
        }   yield word :: rest
       }.toSet;System.out.println("""encode: (number: String)Set[List[String]]""");$skip(89); 
  
  def translate(number: String): Set[String] =
    encode(number) map(_ mkString " ");System.out.println("""translate: (number: String)Set[String]""");$skip(28); val res$0 = 
  
  
  
  wordCode("JAVA");System.out.println("""res0: String = """ + $show(res$0))}
    /**
    * A map from digit strings to the words that represent them
    * e.g., "5282" -> List("Java", "Kata", "Lava", ...)
    */

}
