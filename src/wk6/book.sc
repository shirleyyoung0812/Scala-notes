package wk6

object book {
  case class Book(title: String, authors: List[String])
  val books = List(
    Book(
      title = "Structure and Interpretation of Computer Programs",
      authors = List("Abelson, Harald", "Sussman, Gerald J. ")),
    Book(
      title = "Introduction to Functional Programming",
      authors = List("Bird, Richard", "Wadler, Phil")),
    Book(
      title = "Effective Java",
      authors = List("Bloch, Joshua")),
    Book(
      title = "Java Puzzlers",
      authors = List("Bloch, Joshua", "Gafter, Neal")),
    Book(
      title = "Programming in Scala",
      authors = List("Odersky, Martin", "Spoon, Lex",  "Venners, Bill")))
                                                  //> books  : List[wk6.book.Book] = List(Book(Structure and Interpretation of Com
                                                  //| puter Programs,List(Abelson, Harald, Sussman, Gerald J. )), Book(Introductio
                                                  //| n to Functional Programming,List(Bird, Richard, Wadler, Phil)), Book(Effecti
                                                  //| ve Java,List(Bloch, Joshua)), Book(Java Puzzlers,List(Bloch, Joshua, Gafter,
                                                  //|  Neal)), Book(Programming in Scala,List(Odersky, Martin, Spoon, Lex, Venners
                                                  //| , Bill)))
    
    for  (b <- books; a <- b.authors if a startsWith "Bloch, ") yield b.title
                                                  //> res0: List[String] = List(Effective Java, Java Puzzlers)
    
    for {
      b1 <- books
      b2 <- books
      if b1.title < b2.title
      a1 <- b1.authors
      a2 <- b2.authors
      if a1 == a2
    } yield a1                                    //> res1: List[String] = List(Bloch, Joshua)
}