package practical_2

object Q4 {

  def main(args:Array[String]): Unit = {

    for(i<-1 to 3){

      print("enter the value to find the profit (only 10,15,20 prices) = ")
    val Ticketprice=scala.io.StdIn.readInt()
    val Income = income(Ticketprice)
    println(f"all Income = $Income%.2f")
    val atendeecost = AtendeeCost(Ticketprice)
    println(f"all atendeecost = $atendeecost%.2f")

    var normalcost= 500
    var profit = Income-(normalcost+atendeecost)
    println(f"Final profit = $profit%.2f")
      println()

    }
  }

  def income(value: Int): Int = {

    if (value < 15) {

      if (value == 10) {

        val performance1 = 140
        val price1 = 20
        return performance1 * price1
      }
    }

    else if (value == 15) {

      val performance2 = 120
      val price2 = 15
      return performance2 * price2
    }

    else if (value == 20) {

      val performance3 = 80
      val price3 = 20
      return performance3 * price3
    }

    0

  }

  def AtendeeCost(value:Int):Int={

      if (value < 15) {

        if (value == 10) {

          var atend1=140
          var AtendCost=3

          return atend1*AtendCost
        }
      }

      else if (value == 15) {

        var atend2=120
        var AtendCost=3
        return atend2*AtendCost

      }

      else if (value == 20) {

        var atend3=100
        var AtendCost=3
        return atend3*AtendCost

      }

      0


  }

}
