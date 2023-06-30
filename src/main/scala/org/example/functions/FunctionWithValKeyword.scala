package org.example.functions

object FunctionWithValKeyword extends App{
  def discountFunction(totalCost: Double): Double = {
    totalCost * 0.5
  }

  //  Higher Order Function is a function that takes another function as its parameter.

  def totalCost(price: Double)(quantity : Double)(discountFunction: Double => Double): Double = {
     val totalCostWithoutDiscount = price*quantity
    discountFunction(totalCostWithoutDiscount)
  }

  totalCost(5)(5)(discountFunction(_))


  //function with val keyword
  // val functions are instances of FunctionN classes
  val discountFunctionOne = (totalCost: Double) => {
    totalCost * 0.5
  }

//  // with type inference
//  val discountFunctionOne: Double => Double = totalCost => {
//    totalCost * 0.5
//  }

  totalCost(5)(5)(discountFunctionOne)

  val taxFunction = (totalCost: Double) => {
    totalCost + 0.18*totalCost
  }

  val totalCostOne: Double = 10

  //using andThen function :  (f andThen g)(x) = g(f(x))
  println((discountFunctionOne andThen taxFunction)(totalCostOne))

  //USING compose to compose two function together:  (f compose g)(x) = f(g(x))

  println(discountFunctionOne(totalCostOne))  //calling val function

  println((discountFunctionOne compose taxFunction)(totalCostOne))





}
