//persistent data structures: when perform changes on the data structure
//the old version of data structure is still perserved
//subclass conform to superclass: an object of subclass can be used wherever an object
//of type superclass is required
object abstractClasses {
  val t1 = new NonEmptyTree(3, new EmptyTree, new EmptyTree)
  val t2 = t1 incl 4
}
  abstract class IntSet {
    def incl(x: Int): IntSet
    def contains(x: Int): Boolean
    def union(other: IntSet): IntSet
  }
  
  // first type of BST, represented by empty set
  
  class EmptyTree extends IntSet {
    def contains(x: Int): Boolean = false
    def incl(x: Int): IntSet = new NonEmptyTree(x, new EmptyTree, new EmptyTree)
    def union(other: IntSet): IntSet = other
    override def toString = "*"
  }
  //There is in fact only one single empty IntSet, so no need to create a class
  //that is able to create many instances. Thus we can use an object definition
  //This defines a singleton object. No other Empty instances can be (or need to be)
  //created.
  //Singleton objects are values, so Empty evaluates to itself.
   object Empty extends IntSet {
    def contains(x: Int): Boolean = false
    def incl(x: Int): IntSet = new NonEmptyTree(x, Empty, Empty)
  }
  class NonEmptyTree(elem: Int, left: IntSet, right: IntSet) extends IntSet {
    def contains(x: Int): Boolean =
      if (x < elem) left contains x
      else if (x > elem) right contains x
      else true
   
   def incl(x: Int): IntSet =
    if (x < elem) new NonEmptyTree(elem, left incl x, right)
    else if (x > elem) new NonEmptyTree(elem, left, right incl x)
    else this
   //dynamic method dispatch: the code invoked by a method call depends on
   //the runtime type of the object that contains the method
   def union(other: IntSet): IntSet =
    ((left union right) union other) incl elem
   override def toString = "{" + left + elem + right + "}"
  }
  
  abstract class Base {
    def foo = 1
    def bar: Int
  }
  
  class Sub extends Base {
    override def foo = 2
    def bar = 3
  }