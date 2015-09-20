object error {
  def error(msg: String) = throw new Error(msg)   //> error: (msg: String)Nothing
  
  val x = null                                    //> x  : Null = null
  val y: String = x                               //> y  : String = null
  //null is a suptype only of a reference type not a value type
  //both of the values are values of a supertype, AnyVal (Any is a super class of AnyVal)
  //we want to be as specific as possible
 if (true) 1 else false                           //> res0: AnyVal = 1
}