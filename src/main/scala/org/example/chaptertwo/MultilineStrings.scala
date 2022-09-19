package org.example.chaptertwo

object MultilineStrings extends App {
  // 1. Use backslashes to escape double quotes
  val donutJson: String = "{\"donut_name\":\"Glazed Donut\",\"taste_level\":\"Very Tasty\",\"price\":2.50}"

  println(s"donutJson2 = $donutJson")

  // 2. Using triple quotes """ to escape characters
  val donutJson3: String = """{"donut_name":"Glazed Donut","taste_level":"Very Tasty","price":2.50}"""
  println(s"donutJson3 = $donutJson3")

  // 3. Creating multi-line text using stripMargin
  val donutJson4: String =
    """
      |{
      |"donut_name":"Glazed Donut",
      |"taste_level":"Very Tasty",
      |"price":2.50
      |}
      """
      .stripMargin

  println(s"donutJson3 = $donutJson4")

  val donutJson5: String =
    """
      *{
      *"donut_name":"Glazed Donut",
      *"taste_level":"Very Tasty",
      *"price":2.50
      *}
      """
      .stripMargin('*')

  println(s"donutJson3 = $donutJson5")


}
