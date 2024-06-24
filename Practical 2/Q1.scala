package practical_2

object Q1 {


    def main(args: Array[String]): Unit = {
      var i, j, k = 2
      var m, n = 5
      var f = 12.0f
      var g = 4.0f
      var c = 'X'

      // Evaluating the expressions
      val Q1 = k + 12 * m
      val Q2 = m / j
      val Q3 = n % j
      val Q4 = m / j * j
      val Q5 = f + 10 * 5 + g

      i += 1
      val Q6 = i * n

      // Printing the results
      println(s" k + 12 * m = $Q1")
      println(s" m / j = $Q2")
      println(s" n % j = $Q3")
      println(s" m / j * j = $Q4")
      println(s" f + 10 * 5 + g = $Q5")
      println(s" ++i * n = $Q6")

    }

  }

/* Java Vs Scala

Java: Uses a static type system with explicit type declarations.
Scala: Also statically typed but with a more advanced type system.
       It supports type inference, covariance and contravariance, and
       higher-kinded types, allowing for more expressive and safer code.

Java: Functional programming features were introduced with Java 8,
      including lambda expressions, the Stream API, and method references.
Scala: Fully embraces functional programming.
       It includes features like immutable collections, pattern matching,
       higher-order functions, and a rich set of functional programming libraries.
 */
