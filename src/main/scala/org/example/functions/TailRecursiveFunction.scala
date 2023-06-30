package org.example.functions

import scala.util.control.TailCalls.{TailRec, done, tailcall}

object TailRecursiveFunction extends App{

  val arrayDonuts: Array[String] = Array("Vanilla Donut", "Strawberry Donut", "Plain Donut", "Glazed Donut")
  // The @annotation.tailrec instructs the compiler to add any optimisations with regards to stack frame management as this function is recursive.
   @annotation.tailrec
  def search(name: String, arrayDonuts: Array[String], index: Int): Option[Boolean] = {
    if(index >= arrayDonuts.length){
      None
    }
    else if(arrayDonuts(index) == name){
      Some(true)
    }
    else {
      val newIndex = index +1
      search(name, arrayDonuts, newIndex)
    }
  }

  println(search("Plain Donut", arrayDonuts, 0))


  // using scala.util.control.TailCalls._  package

  def tailSearch(name: String, arrayDonuts: Array[String], index: Int): TailRec[Option[Boolean]] = {
    if(index >= arrayDonuts.length){
      done(None)
    }
    else if(arrayDonuts(index) == name){
      done(Some(true))
    }
    else {
      val newIndex = index +1
      tailcall(tailSearch(name, arrayDonuts, newIndex))
    }
  }


  println(tailcall(tailSearch("Plain Donut", arrayDonuts, 0)).result)

}
