package org.example.functions

object CreateFunctions extends App{

  //Basic function
  def printMyName(): Unit = {
  println("Nandani Shakshi")
  }

  //or
  def printMyNameAgain = println("Nandani Shakshi")

  //function with return value
  def returnMyName: String = "Nandani Shakshi"


  //functions with parameters
  def add(x: Int, y:Int):Int = x+y

// call a function
  println(add(2,3))

  //functions with parameters and default value,
  // using option is better than giving default values
  def addAgain(x: Int, y:Int, z:Int = 0):Int = x+y+z

  println(addAgain(2,3))

  println(addAgain(3,4,5))

  //function with option, some and none

  def addAgainAgain(x:Int, y: Int, z: Option[Int]=None):Int = {
    z match {
      case Some(i) => x+y+i
      case None => x+y
    }
  }

  println(addAgainAgain(2,3))
  println(addAgainAgain(2,3,Some(4)))

/// map doesn't detect None
  val a: Option[String] = Some("Glazed Donut")
  a.map(d => println(s"Favorite donut = $d"))

  val b: Option[String] = None
  b.map(d => println(s"Least Favorite donut = $d"))


  //Function returns option type
   def optionReturnType():Option[String] ={
     val op =  ""

     Option(op).filter(_.nonEmpty)

  }

  val couponCode: Option[String] = optionReturnType()

  println(couponCode.getOrElse("Nandani"))

  //using Function with pattern matching

  optionReturnType() match {
    case Some(code) => println(s"${code}")
    case None => println("No code found")
  }
//map with option
  optionReturnType().map(code => println(s"Today's coupon code = $code"))

  //fold function
  val todayCouponUsingFold: String = optionReturnType().fold("No Coupon Available")(code => code)

  println(todayCouponUsingFold)



}
