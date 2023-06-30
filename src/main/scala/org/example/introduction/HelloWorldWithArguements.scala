package org.example.introduction

object HelloWorldWithArguements {
  def main(args: Array[String]): Unit = {
    println("Hello World!")
    println(args.mkString(","))
  }
}
