package org.example.functions

object VarArgsFunction extends App{

  //Variable parameter

  def printReport(names: String*): Unit = {
    println(names.mkString("_"))
  }

  printReport("hello")
  printReport("hello", "lovey", "dovey")

  val listNames: List[String] = List("hello", "kovey", "dovey")

  printReport(listNames: _*)   //Type ascription

  val seqNames: Seq[String] = Seq("hello", "go", "boy", "fetch")

  printReport(seqNames:_*)

  val arrayNames: Array[String] = Array("New", "type","learn")

  printReport(arrayNames:_*)

}
