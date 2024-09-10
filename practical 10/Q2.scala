object RationalTest {
  def main(args: Array[String]): Unit = {
    // x = 3/4, y = 5/8, z = 2/7
    val x = new NewRational(3, 4)
    val y = new NewRational(5, 8)
    val z = new NewRational(2, 7)

    // Perform the subtraction x - y - z
    val result = x.sub(y).sub(z)
    println(s"Result of x - y - z = $result")
  }
}
class NewRational(n: Int, d: Int) {
  require(d != 0, "Denominator cannot be zero")

  private val gcd = greatestCommonDivisor(n.abs, d.abs)
  val numerator: Int = n / gcd
  val denominator: Int = d / gcd

  //subtract rational numbers
  def sub(that: NewRational): NewRational = {
    val newNumerator = this.numerator * that.denominator - that.numerator * this.denominator
    val newDenominator = this.denominator * that.denominator
    new NewRational(newNumerator, newDenominator)
  }
  //display the rational number
  override def toString: String = s"$numerator/$denominator"

  private def greatestCommonDivisor(a: Int, b: Int): Int = {
    if (b == 0) a else greatestCommonDivisor(b, a % b)
  }
}


