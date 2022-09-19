package org.example.chaptertwo

import org.example.chaptertwo.EnumerationExample.DonutValue

object PatternMatching extends App{

  // Basic pattern matching

  val name = "nandani"

  name match {
    case "nandani" => println("yes correct")
    case "naina" | "ashi" => println("in between")
    case _ => println("No wrong")
  }

  // Pattern Matching with returning the result

  val num = 65

  val newNum:Int = num match {
    case num if (num%2 == 0 || num==0) => num*2
    case num if (num%2 != 0) => num*3
  }
   println(newNum)

  /// Return type
  val priceOfDonut: Any = 2.50
  val priceType = priceOfDonut match {
    case price: Int => "Int"
    case price: Double => "Double"
    case price: Float => "Float"
    case price: String => "String"
    case price: Boolean => "Boolean"
    case price: Char => "Char"
    case price: Long => "Long"
  }
  println(s"Donut price type = $priceType")

  //Pattern matching with tuples

  println("\nStep 4: How to use pattern matching on Tuples")
  val glazedDonut = Tuple3("Glazed Donut", "Very Tasty", 2.50)
  val strawberryDonut = Tuple3("Strawberry Donut", "Very Tasty", 2.50)
  val plainDonut = Tuple3("Plain Donut", "Tasty", 2)
  val donutList = List(glazedDonut, strawberryDonut, plainDonut)

  val priceOfPlainDonut = donutList.foreach { tuple => {
    tuple match {
      case ("Plain Donut", taste, price) => println(s"Donut type = Plain Donut, price = $price")
      case d if d._1 == "Glazed Donut" => println(s"Donut type = ${d._1}, price = ${d._3}")
      case (donutType, taste, 2) => println(s"$donutType")
      case _ => None
    }
  }
  }

  //Pattern Matching with Enumerations
  DonutValue.values.foreach {
    case d if(d == DonutValue.Glazed || d== DonutValue.Strawberry)  => println(s"Found donut type = ${d}")
    case _ => println("found other types")
  }

}
