package practical_7

object Q3 {
  def main(args: Array[String]): Unit = {
    val inputList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val primeNumbers = filterPrime(inputList)
    println(s"Input: $inputList")
    println(s"Output: $primeNumbers")
  }

  def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(num => isPrime(num))
  }

  def isPrime(n: Int): Boolean = {
    if (n <= 1) false
    else (2 until math.sqrt(n).toInt + 1).forall(i => n % i != 0)
  }
}