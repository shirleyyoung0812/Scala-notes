package wk4

/**
 * define natural number class 
 * Peano numbers
 * @author shirleyyoung
 */
abstract class Nat {
  def isZero: Boolean
  def predecessor: Nat
  def successor = new Succ(this)
  def +(that: Nat): Nat
  def -(that: Nat): Nat
}

object Zero extends Nat {
  def isZero = true
  def predecessor = throw new Error("0.predecessor")
  def +(that: Nat) = that
  def -(that: Nat) = if(that.isZero) this else throw new Error("0.predecessor")
}

class Succ(n: Nat) extends Nat {
  def isZero = false
  def predecessor = n
  //n + that would give a number that is 1 smaller than this + that
  //so we return the successor of (n + that)
  def +(that: Nat) = new Succ(n + that)
  def -(that: Nat) = if (that.isZero) this else n - that.predecessor
}