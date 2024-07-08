package practical_4

object Q1 {

  def main(args: Array[String]): Unit = {
    displayInventory()
    restockItem("Apples", 5)
    sellItem("Bananas", 3)
    displayInventory()
    restockItem("Grapes", 10)
    sellItem("Oranges", 10)
  }

  var itemNames: Array[String] = Array("Apples", "Bananas", "Oranges")
  var itemQuantities: Array[Int] = Array(10, 5, 8)

  def displayInventory(): Unit = {
    println("Inventory:")
    for (i <- itemNames.indices) {
      println(s"${itemNames(i)}: ${itemQuantities(i)}")
    }
  }

  def restockItem(itemName: String, quantity: Int): Unit = {
    val index = itemNames.indexOf(itemName)
    if (index >= 0) {
      itemQuantities(index) += quantity
      println(s"Restocked $quantity of $itemName. New quantity: ${itemQuantities(index)}")
    } else {
      println(s"Item '$itemName' does not exist.")
    }
  }

  def sellItem(itemName: String, quantity: Int): Unit = {
    val index = itemNames.indexOf(itemName)
    if (index >= 0) {
      if (itemQuantities(index) >= quantity) {
        itemQuantities(index) -= quantity
        println(s"Sold $quantity of $itemName. New quantity: ${itemQuantities(index)}")
      } else {
        println(s"Not enough $itemName in stock to sell $quantity. Available quantity: ${itemQuantities(index)}")
      }
    } else {
      println(s"Item '$itemName' does not exist.")
    }
  }
}
