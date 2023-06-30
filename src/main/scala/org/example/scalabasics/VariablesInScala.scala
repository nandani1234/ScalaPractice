package org.example.scalabasics

object VariablesInScala extends App {

  //Different Types
  val a: Int = 5
  val b: Long = 100000000L
  val c: Short = 1
  val d: Double = 2.50
  val e: Float = 2.50f
  val f: String = "allaboutscala Donut Store"
  val g: Byte = 0xa
  val h: Char = 'D'
  val i: Unit = ()

  //Mutable variable
  var j: Int = 6
  j = 7

  //Lazy variable
  lazy val k: Int = 8

  //Empty variable
  var l: Int = _
  l = 9


}
