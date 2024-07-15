package practical_5

object Q1 {

  def main(args: Array[String]): Unit = {

    val productList = GetProductList()

    println("Product List:")
    printProductList(productList)

    val totalProducts = GetTotalProducts(productList)
    println(s"Total number of products: $totalProducts")

  }

  def GetProductList(): List[String]  = {

    def loop(push: List[String]): List[String] = {

      print("Enter product name (type '0' for finish): ")
      val str = scala.io.StdIn.readLine()

      if (str == "0") {

        return push;
      }
      else loop(push :+ str)
    }
    loop(List.empty)
  }

  def printProductList(products: List[String]): Unit = {

    products.zipWithIndex.foreach { case (product, index) =>  println(s"${index + 1}. $product")

    }
  }

  def GetTotalProducts(products: List[String]): Int = {
    products.length
  }
}