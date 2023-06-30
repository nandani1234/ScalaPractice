package org.example.scalabasics

object StringFormatting extends App {
  //1. Using String interpolation to print a variable:

  val a: String = "Glazed Donut"
  println(s"My favorite donut = $a")

  // 2. Using String interpolation on object properties:

  case class Donut(name: String, tasteLevel: String)

  val b: Donut = Donut("Glazed Donut", "Very Tasty")
  println(s"My favorite donut name = ${b.name}, tasteLevel = ${b.tasteLevel}")

  //  3. Using String interpolation to evaluate expressions:

  val c: Int = 10
  println(s"Are we buying 10 donuts = ${c == 10}")

  //  4. Using String interpolation for formatting text:

  val d: String = "Vanilla Donut"
  val e: String = "Tasty"
  println(f"$d%20s $e")

  //  This will add white white spaces in front to make string d length to 20.
  //  5. Using g interpolation to format numbers:

  val g: Double = 2.50
  println(s"Donut price = $g")
  println(f"Formatted donut price = $g%.2f")

  //o/p ->  2.50 upto 2 decimals..default will remove last zeros.

  //  6. Using Raw interpolation:
  //    The raw String interpolation will allow you to print any symbols within your String. (Like \t or \n)

  println(raw"Favorite donut\t$a")

  //  o/p -> Favorite donut\tGlazed Donut

}
