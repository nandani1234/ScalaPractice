package org.example.chapterone

object HelloWorldWithArguements {
  def main(args: Array[String]): Unit = {
    println("Hello World!")
    println(args.mkString(","))
  }
}
