package Practical_3

object Q4 {

  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val sum = sumOfEven(numbers)
    println(s"Sum of even numbers is: $sum")
  }

  def sumOfEven(numbers: List[Int]): Int = {
    var sum = 0
    for (num <- numbers) {
      if (num % 2 == 0) {
        sum += num
      }
    }
    return sum
  }
}
