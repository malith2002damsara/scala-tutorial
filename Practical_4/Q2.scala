package practical_4

object Q2 {
  def main(args: Array[String]): Unit = {

   while(true){

    print("Enter the any integer number : ")
    val num = scala.io.StdIn.readInt()
    val result = check_number(num)
    println(result)
     println()
   }

  }

  def check_number(num: Int): String = {

    num <= 0 match {
      case true => num==0 match { case true =>"Number is Zero" case false => "Number is Negative" }
      case false => num % 2 == 0 match {  case true => "Number is even"  case false => "Number is odd" }

    }
  }
}