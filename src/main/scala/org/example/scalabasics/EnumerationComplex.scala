package org.example.scalabasics


object EnumerationComplex extends App {
  object Weekday extends Enumeration {
    type Weekday = Value
    val mon,tue, wed, thur, fri, sat, sun = Value
  }
  import Weekday._

  def WorkingDay(d: Weekday) ={
     !( d== sat || d ==  sun )
  }

  Weekday.values.foreach{ x => if (WorkingDay(x)) println(x)  }

  //or

  Weekday.values filter WorkingDay foreach println

  //using enum keyword



//  enum BakingEvents(val index: Int) {
//    case BakeDonut extends BakingEvents(1)
//    case AddTopping extends BakingEvents(2)
//    case StopBaking extends BakingEvents(3)
//  }



}
