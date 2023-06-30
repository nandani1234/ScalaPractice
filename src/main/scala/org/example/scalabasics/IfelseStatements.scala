package org.example.scalabasics

object IfelseStatements extends App {
  val numberOfPeople = 20
  val donutsPerPerson = 2

  if (numberOfPeople > 10)
    println(s"Number of donuts to buy = ${numberOfPeople * donutsPerPerson}")

  val defaultDonutsToBuy = 8

  if (numberOfPeople > 10)
    println(s"Number of donuts to buy = ${numberOfPeople * donutsPerPerson}")
  else
    println(s"Number of donuts to buy = $defaultDonutsToBuy")


  if (numberOfPeople > 10) {
    println(s"Number of donuts to buy = ${numberOfPeople * donutsPerPerson}")
  } else if (numberOfPeople == 0) {
    println("Number of people is zero.")
    println("No need to buy donuts.")
  } else {
    println(s"Number of donuts to buy = $defaultDonutsToBuy")
  }

  // using if else as expressions
  val numberOfDonutsToBuy = if (numberOfPeople > 10) (numberOfPeople * donutsPerPerson) else defaultDonutsToBuy
  println(s"Number of donuts to buy = $numberOfDonutsToBuy")


}
