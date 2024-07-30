package practical06

object Q1 {

  def main(args: Array[String]): Unit = {

    val inventory1: Map[Int, (String, Int, Double)] = Map(

      1 -> ("books", 10, 75.50),
      2 -> ("pens", 20, 20.00),
      3 -> ("pencils", 5, 30.00),

    )

    val inventory2: Map[Int, (String, Int, Double)] = Map(
      4 -> ("apples", 12, 110.50),
      5 -> ("oranges", 4, 70.75),
      6 -> ("bananas", 32, 15.00)
    )

    println()
    val names = getProductNames(inventory1)
    println("Product Names: " + names)
    println()

    val totalValue = calculateTotalValue(inventory1)
    println("Total Value of inventory1: " + totalValue)
    println()

    val isEmpty = check(inventory1)
    println("Is Inventory1 Empty: " + isEmpty)
    println()

    val mergedInventory = mergeInventories(inventory1, inventory2)
    println("Merge Inventory: " + mergedInventory)
    println()

    checkProductExists(inventory1, 4)
  }

  def getProductNames(inventory1: Map[Int, (String, Int, Double)]): List[String] = {
    var productNames: List[String] = List()
    inventory1.values.foreach { case (name, _, _) =>
      productNames = productNames :+ name
    }
    productNames
  }

  def calculateTotalValue(inventory1: Map[Int, (String, Int, Double)]): Double = {
    var totalValue: Double = 0.0
    inventory1.values.foreach { case (_, quantity, price) =>
      totalValue += quantity * price
    }
    totalValue
  }

  def check(inventory1: Map[Int, (String, Int, Double)]): Boolean = {
    inventory1.isEmpty
  }

  def mergeInventories(inventory1: Map[Int, (String, Int, Double)], inventory2: Map[Int, (String, Int, Double)]): Map[Int, (String, Int, Double)] = {
    inventory2.foldLeft(inventory1) { (acc, item) =>
      val (id, (name, quantity, price)) = item
      acc.get(id) match {
        case Some((existingName, existingQuantity, existingPrice)) =>
          acc + (id -> (name, existingQuantity + quantity, Math.max(existingPrice, price)))
        case None =>
          acc + (id -> (name, quantity, price))
      }
    }
  }


  def checkProductExists(inventory1: Map[Int, (String, Int, Double)], productId: Int): Unit = {
    inventory1.get(productId) match {
      case Some((name, quantity, price)) =>
        println(s"Product ID: $productId, Name: $name, Quantity: $quantity, Price: $price")
      case None =>
        println(s"Product with ID: $productId does not exist in the inventory")
    }
  }
}
