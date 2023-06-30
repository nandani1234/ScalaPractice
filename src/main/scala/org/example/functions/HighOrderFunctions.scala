package org.example.functions

import scala.util.Random

object HighOrderFunctions extends App {

  def discountFunction(totalCost: Double): Double = {
    totalCost * 0.5
  }

  //  Higher Order Function is a function that takes another function as its parameter.

  def totalCost(price: Double)(quantity: Int)(discountFunction: Double => Double): Double = {
    val totalCostWithoutDiscount = price * quantity
    totalCostWithoutDiscount - discountFunction(totalCostWithoutDiscount)
  }

  //calling high order function with anonymous function
  println(totalCost(5)(5) {
    totalCostWithoutDiscount =>
      val discount = 0.05
      totalCostWithoutDiscount * discount
  }
  )

  // calling high order function with another function
  println(totalCost(5)(5)(discountFunction(_)))


 // High order function: call by name ***

  val val1: List[(String, Double, Double)] = List(("type1", 5, 5), ("type2", 6, 4), ("type3", 5, 6), ("type4", 6, 4))

  //simple high order function
  def placeOrder(orders: List[(String, Double, Double)])(exchangeRate: Double)= {
    var totalCost: Double = 0.0
    orders.foreach {order =>
      val costOfItem = order._2 * order._3 * exchangeRate
      println(s"Cost of ${order._2} ${order._1} = £$costOfItem")
      totalCost += costOfItem
    }
    totalCost
  }

  println(placeOrder(val1)(7))


  //call by name function
  def placeOrderOne(orders: List[(String, Double, Double)])(exchangeRate: => Double)= {
    val totalCost = orders.map(x => x._2*x._3*exchangeRate).sum
    totalCost
  }

  val rate: Random = new Random(10)

  def usdToRs: Double = {
    val returnRate =  rate.nextDouble()
    println(returnRate, "new rate")
    returnRate
  }

  // For each order in the list, a new exchange rate is being created and the call-by-name function usdToGbp function is evaluated each time.
  println(placeOrderOne(val1)(usdToRs))


  // High order function : callback function parameter, function which has a callback or Option callback parameter.

  def printReport(sendEmail: () => Unit):Unit = {
    println("report printed")
    sendEmail()
  }

  printReport(() => println("sending email"))


  // optional callback function
  def printReportOption(sendEmail: Option[() => Unit] = None):Unit = {
    println("report printed")
    sendEmail.map(callback => callback)
  }

  printReportOption()

  printReportOption(Some(() => println("send email")))




}

