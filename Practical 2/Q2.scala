package practical_2

object Q2 {

  def main(args: Array[String]): Unit = {
    var a: Int = 2
    var b: Int = 3
    var c: Int = 4
    var d: Int = 5
    var g: Float = 5.0f
    var k: Float = 4.3f

    val q1 = Q1(a, b, c, d)
    val q2 = Q2(a)
    val q3 = Q3(c, g, k)
    val q4 = Q4(c)
    val q5 = Q5(a, c)
  }

  def Q1(a: Int, b: Int, c: Int, d: Int): Int = {
    print("(a). ")
    val newD = d - 1
    val newB = b - 1
    val result = newB * a + c * newD
    println(result)
    result
  }

  def Q2(a: Int): Unit = {
    print("(b). ")
    val newA = a + 1
    println(newA)
  }

  def Q3(c: Int, g: Float, k: Float): Unit = {
    print("(c). ")
    val result = -2 * (g - k) + c
    println(result)

  }

  def Q4(c: Int): Unit = {
    print("(d). ")
    val newC = c + 1
    println(newC)

  }

  def Q5(a: Int, c: Int): Unit = {
    print("(e). ")
    val newA = a + 1
    val newC = c + 1
    val result = newC * newA
    println(result)

  }
}
