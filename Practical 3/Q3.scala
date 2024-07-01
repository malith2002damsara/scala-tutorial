package Practical_3

object Q3 {

  def main(args: Array[String]): Unit = {
    val num1 = 12
    val num2 = 11
    val average = calculateMean(num1, num2)
    println(s"Rounded mean of $num1 and $num2 is: $average")

     }
    def calculateMean(num1: Int, num2: Int): Double = {
      val mean = (num1 + num2) / 2.0
      math.round(mean)
    }
    }




