object Q1 {

  def main(args: Array[String]): Unit = {

    val deposit = 25000 
    val interest = calculate(deposit)
    println(s"The bank pays an interest of Rs. $interest on a deposit of Rs. $deposit")
  }

  def calculate: Double => Double = (deposit) => deposit match {
    case deposit if deposit <= 20000 => deposit * 0.02
    case deposit if deposit <= 200000 => deposit * 0.04
    case deposit if deposit <= 2000000 => deposit * 0.035
    case deposit if deposit > 2000000 => deposit * 0.065
  }

}



