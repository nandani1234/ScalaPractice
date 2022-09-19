package org.example.chaptertwo

object EnumerationExample extends App {
  object DonutValue extends Enumeration{
    type DonutValue = Value

    val Glazed      = Value("Glazed")
    val Strawberry  = Value("Strawberry")
    val Plain       = Value("Plain")
    val Vanilla     = Value("Vanilla")

  }
object DonutTaste extends Enumeration{

  type DonutTaste = Value

  val Tasty       = Value(0, "Tasty")
  val VeryTasty   = Value(1, "Very Tasty")
  val Ok          = Value(-2, "Ok")


}

  println(s"Vanilla Donut string value = ${DonutValue.Vanilla}")
  println(s"Vanilla Donut's id = ${DonutValue.Vanilla.id}")
  println(s"Donut types = ${DonutValue.values}")


  println(s"Donut taste values = ${DonutTaste.values}")
  println(s"Donut taste of OK id = ${DonutTaste.Ok.id}")

}
