package org.example.functions

object FuncCurrying extends App {


  // Functions defined with parameter groups are also commonly referred to as curried functions.
  def totalCost(dType: String)(quantity: Int)(discount: Double): Double = {
    println(s"Calculating total cost for $quantity $dType with ${discount * 100}% discount")
    val totalCost = 2.50 * quantity
    totalCost - (totalCost * discount)
  }

  println(totalCost("Glazed Donut")(10)(0.1))


  // Partial applied functions
//  the partially applied function creates a chain of functions.

  val totalPrice: Int => Double => Double = totalCost("Glazed Donut") _

  println(totalPrice(10)(0.5))


}
