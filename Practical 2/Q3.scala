package practical_2

object Q3 {

  def main(args:Array[String]): Unit={

    val normalhour = 40
    val Othour = 30
    var salary= Salary(normalhour,Othour)


    var weeksalary= WeekSalaryWithTax(salary)

    println(f"Week Take home salary of an employee = $weeksalary")

    var Monthlysalary = monthlysalary(weeksalary)
    println(f"employee monthly salary = $Monthlysalary%.2f")

  }

  def Salary(normalhour:Int,Othour:Int):Int={

   var normalpay = 250
    var otpay = 85

    normalhour*normalpay + Othour*otpay

  }
  def WeekSalaryWithTax(salary:Double): Double = {

    var taxrate = 0.12

    salary - (salary*taxrate)

  }
  def monthlysalary(weeksalary:Double):Double={

    val weeks= 4
    weeksalary*weeks

  }

}
