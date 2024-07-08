package practical_4

object Q3 {
  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    names.foreach { name =>
      print(formatNames(name, toLower))
      print("  --  ")
      print(formatNames(name, toUpper))
      println()
    }
  }

  def toUpper(str: String): String = {
    str.toUpperCase
  }

  def toLower(str: String): String = {
    str.toLowerCase
  }

  def formatNames(name: String, Func: String => String): String = {
    Func(name)
  }

}