package Practical_3

object Q1 {

  def main(args: Array[String]): Unit = {
    val input = "malith"
    val reversed = reverseString(input)
    println(s"Before: $input")
    println(s"After: $reversed")
  }

  def reverseString(str: String): String = {
    if (str.isEmpty) ""
    else reverseString(str.tail) + str.head
  }
   }


