package org.example.functions

object FuncAsSymbols extends App{

  val exp = new newExp

  println(exp.-(0.05))

  println(exp - 0.05)


}

//Defining functions using symbols is a great feature of Scala to allow you to create Domain Specific Language (DSL).


class newExp {
  val choc = 100

  def -(discount: Double): Double = {
    choc - discount*choc
  }

//This symbol doesnt make sense so create sensible symbol functions
  def +++(taxAmount: Double): Double = {
    choc + taxAmount
  }
}
