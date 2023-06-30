package org.example.introduction

import com.typesafe.scalalogging.LazyLogging

object HelloWorldWithLogging extends App with LazyLogging {
  logger.info("new hello world app")
  println("hello world")
  logger.info("new hello world app")

}
