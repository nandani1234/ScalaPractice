package org.example.scalabasics

object WhileLoop extends App {
  //simple while loop

  var a = 10
  while (a > 0) {
    println(s"Remaining donuts to be baked = $a")
    a -= 1
  }

  // do while

  var b = 0
  do {
    b += 1
    println(s"Number of donuts baked = $b")
  } while (b < 5)


}
