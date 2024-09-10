object Q5 {

  def main(args: Array[String]): Unit = {
    val words = List("apple", "banana", "cherry", "date")
    val totalLetters = countLetterOccurrences(words)
    println(s"Total count of letter occurrences: $totalLetters")
  }
    def countLetterOccurrences(words: List[String]): Int = {

      val lengths = words.map(_.length)

      val totalCount = lengths.reduce(_ + _)

      totalCount
    }
  }
