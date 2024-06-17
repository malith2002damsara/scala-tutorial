package demo

object demo {

  /*Q1.Area of a disk with radius r is Pi r*r. What is the area of a disk with
radius 5? */

    // Function to calculate the area of a disk given its radius
    def areaOfDisk(radius1: Double): Double = {
      math.Pi * radius1 * radius1
    }

  /*Q2.The temperature is 35C; convert this temperature into Fahrenheit.
ºF =ºC * 1.8000 + 32.00. */

  // Function to convert Celsius to Fahrenheit
  def celsiusToFahrenheit(celsius: Double): Double = {
    celsius * 1.8 + 32
  }

  /*Q3.The volume of a sphere with radius r is 4/3 Pi r3. What is the
volume of a sphere
with radius 5? */

    // Function to calculate the volume of a sphere given its radius
    def volumeOfSphere(radius2: Double): Double = {
      (4.0 / 3.0) * math.Pi * math.pow(radius2, 3)
     }

  /*Q4.  Suppose the cover price of a book is Rs. 24.95, but bookstores get
a 40% discount. Shipping costs Rs. 3 for the first 50 copies and 75
cents for each additional copy. What is the total wholesale cost for 60
copies?
*/

    // Function to calculate the total wholesale cost
    def totalWholesaleCost(coverPrice: Double, discount: Double, copies: Int): Double = {
      // Calculate the discounted price per book
      val discountedPrice = coverPrice * (1 - discount / 100)

      // Calculate the total book cost
      val totalBookCost = discountedPrice * copies

      // Calculate the shipping cost
      val shippingCost = if (copies <= 50) {
        3
      } else {
        3 + (copies - 50) * 0.75
      }

      // Calculate the total wholesale cost
      totalBookCost + shippingCost
    }

  /*Q5. I run 2 km at an easy pace (8 min per km), then 3 km at Tempo (7
min per km) and 2 km at easy pace again to reach home. What is the
total running time? */

    // Function to calculate total running time given distances and paces
    def totalRunningTime(distances: List[Double], paces: List[Double]): Double = {
      // Calculate total time by summing up (distance * pace) for each segment
      val totalTime = distances.zip(paces).map { case (distance, pace) => distance * pace }.sum
      totalTime
    }



    def main(args: Array[String]): Unit = {

      //Q1 ************************************************************
      // Calculate the area of a disk with radius 5
      println()
      println("************ Answer is Question number 1 ************")

      val radius1 = 5.0
      val area = areaOfDisk(radius1)
      println(s"The area of a disk with radius $radius1 is $area")

      //Q2 ************************************************************

      // Temperature in Celsius

      println()
      println("************ Answer is Question number 2 ************")

      val celsiusTemperature = 32.0
      // Convert to Fahrenheit
      val fahrenheitTemperature = celsiusToFahrenheit(celsiusTemperature)
      println(s"The temperature $celsiusTemperature°C is equal to $fahrenheitTemperature°F")

      //Q3 *****************************************************************

      // Radius of the sphere
      println()
      println("************ Answer is Question number 3 ************")

      val radius2 = 5.0
      // Calculate the volume
      val volume = volumeOfSphere(radius2)
      println(s"The volume of a sphere with radius $radius2 is $volume")

      //Q4 *******************************************************************

      // Given values
      println()
      println("************ Answer is Question number 4 ************")

      val coverPrice = 24.95
      val discount = 40.0
      val copies = 60

      // Calculate the total wholesale cost
      val totalCost = totalWholesaleCost(coverPrice, discount, copies)
      println(s"The total wholesale cost for $copies copies is Rs. $totalCost")


      //Q5 *********************************************************************

      // Distances in kilometers
      println()
      println("************ Answer is Question number 5 ************")

      val distances = List(2.0, 3.0, 2.0)
      // Paces in minutes per kilometer
      val paces = List(8.0, 7.0, 8.0)

      // Calculate total running time
      val totalTime = totalRunningTime(distances, paces)

      // Print the total running time in minutes
      println(f"The total running time is $totalTime%.2f minutes")


    }

   }






