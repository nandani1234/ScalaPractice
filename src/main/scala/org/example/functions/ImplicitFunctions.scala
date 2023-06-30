package org.example.functions

object ImplicitFunctions {
  implicit val discount: Double = 0.1
  implicit val storeName = "Starbucks"

  // Implicit functions

  implicit def simpleCoffeetoObjectCoffee(s: String) = new Coffee(s)

  def main(args: Array[String]): Unit = {

    //Function with implicit parameter
    // You can provide multiple implicit parameters the same way.

    def buyCoffee(coffeeType: String, quantity: Int)(implicit discount: Double, storeName: String): Double ={
    val totalCost = 5*quantity*(1-discount)
    totalCost
    }

    println(s" coffee total proce = ${buyCoffee("ColdCoffee", 5)}")

    //manually passing implicit parameter

    println(s" coffee total proce = ${buyCoffee("ColdCoffee", 5)(0.2, "CCD")}")


    //calling implicit functions

    val coffee1 = "HotCoffee"
    val coffee2 = "ColdCoffee"

    println(coffee1.isFavourite)
    println(coffee2.isFavourite)

    //Implicit functions is used here to extend String class without modifying any source code







  }

}

class Coffee(s: String){
  def isFavourite: Boolean = s=="ColdCoffee"
}
