package practical_7

object Q2 {
  def main(args: Array[String]): Unit = {
    val inputList = List(1, 2, 3, 4, 5)
    val squaredNumbers = squareNumbers(inputList)
    println(s"Input: $inputList")
    println(s"Output: $squaredNumbers")
  }

  def squareNumbers(numbers: List[Int]): List[Int] = {
    numbers.map(num => num * num)
  }
}
