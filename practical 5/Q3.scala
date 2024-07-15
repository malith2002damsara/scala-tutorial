package practical_5

object Q3 {

  def main(args: Array[String]): Unit = {
    print("Enter the number of Fibonacci numbers to print : ")
    val n = scala.io.StdIn.readInt()
    printFibonacciNumbers(n)
  }

  def printFibonacciNumbers(n: Int): Unit = {

    var a = 0
    var b = 1
    var count = 0

    while (count < n) {

      print(a + " ")

      var c = a + b
      a = b
      b = c

      count += 1
    }
  }
}
