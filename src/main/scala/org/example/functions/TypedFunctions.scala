package org.example.functions

object TypedFunctions extends App{

  //Function with a generic parameter

  def genericParam[T](s: T):Unit = {
    s match {
      case x: String => println (s"String = ${x}")
      case x: Double => println(s"Double = ${x}")
      case _ => println("a differnt type")
    }
  }

    genericParam[String]("guid")
    genericParam[Double](.4)
    genericParam[Int](5)


  //Function with generic parameter and generic return type

  def genParamAndReturn[T](a: T): Seq[T] = {
    a match {
      case i : String => println(i)
        Seq[T](a)
      case i : Double => println(i)
        Seq[T](a)
      case i @ _ => println(i)
        Seq[T](a)
    }
  }


  println(genParamAndReturn[String]("five"))
  println(genParamAndReturn[Double](0.5))
  println(genParamAndReturn[Int](5))

}
