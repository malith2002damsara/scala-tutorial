
object Q2 {

  def main(args: Array[String]): Unit = {

    val input = args(0).toInt 
    
    val result = categorize(input)
    println(result)
  }

  val categorize: Int => String = {
      case n if n == 0 || n < 0  => "Input is Negative or Zero Number"
      case n if n % 2 == 0 => "Input is Even Number"
      case _ => "Input is Odd Number"
    }
}



