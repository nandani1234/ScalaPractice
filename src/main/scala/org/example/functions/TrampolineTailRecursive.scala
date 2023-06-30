package org.example.functions

import scala.util.control.TailCalls.{TailRec, done, tailcall}


object TrampolineTailRecursive extends App{


  def verySweet(sweetList: List[String]): TailRec[Boolean] = {
    if(sweetList.isEmpty){
      println("1")
      done(false)
    }
    if(Set(sweetList.head).subsetOf(Set("Donut","Rasogulla","Barfi"))){
      println("2")
      done(true)
    }
    else {
      println("no sweets found")
      tailcall(notVerySweet(sweetList))
    }
  }

  def notVerySweet(sweetList : List[String]): TailRec[Boolean] = {
    if(sweetList.isEmpty){
      println("3")
      done(false)
    }
//    else if(Set(sweetList.head).subsetOf(Set("Cracker", "Cookie", "Bubbly"))){
//      done(true)
//    }
    else {
      println("no notsweets found")
      tailcall(verySweet(sweetList.tail))
    }
  }

  val sweetList = List("Cracker","Donut","Cookie","Barfi")
  val foundVerySweetDonut = tailcall(verySweet(sweetList)).result

  println(foundVerySweetDonut)

}
