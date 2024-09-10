object Q1 {

  def main(args: Array[String]): Unit = {
    // rational number x = 3/4
    val x = new Rational(3,4)
    val negX = x.neg
    println(s"Original: $x")
    println(s"Negated: $negX")
  }
}
class Rational(n: Int, d: Int) {
  require(d != 0)
  private val gcd = greatestCommonDivisor(n.abs, d.abs)
  val numerator: Int = n / gcd
  val denominator: Int = d / gcd

  def neg: Rational = new Rational(-numerator, denominator)
  //display rational number
  override def toString: String = s"$numerator/$denominator"
  private def greatestCommonDivisor(a: Int, b: Int): Int = {
    if (b == 0) a else greatestCommonDivisor(b, a % b)
  }
}


