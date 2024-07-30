package practical06

object Q2 {

  def main(args: Array[String]): Unit = {
    val studentInfo = getStudentInfoWithRetry()
    printStudentRecord(studentInfo)
  }

  def getStudentInfo: (String, Int, Int, Double, Char) = {
    print("Enter student's name: ")
    val name = scala.io.StdIn.readLine()
    print("Enter student's marks: ")
    val marks = scala.io.StdIn.readInt()
    print("Enter total possible marks: ")
    val totalMarks = scala.io.StdIn.readInt()

    val percentage = (marks.toDouble / totalMarks) * 100
    val grade = calculateGrade(percentage)
    (name, marks, totalMarks, percentage, grade)
  }

  def calculateGrade(percentage: Double): Char = {
    if (percentage >= 90) 'A'
    else if (percentage >= 75) 'B'
    else if (percentage >= 50) 'C'
    else 'D'
  }

  def printStudentRecord(record: (String, Int, Int, Double, Char)): Unit = {
    val (name, marks, totalMarks, percentage, grade) = record

    println()
    println(s"Student Name: $name")
    println()
    println(s"Marks Obtained: $marks")
    println()
    println(s"Total Possible Marks: $totalMarks")
    println()
    println(s"Percentage: $percentage")
    println()
    println(s"Grade: $grade")
  }

  def validateInput(name: String, marks: Int, totalMarks: Int): (Boolean, Option[String]) = {
    if (name.isEmpty) {
      (false, Some("Name cannot be empty."))
    } else if (marks < 0 || marks > totalMarks) {
      (false, Some("Marks must be positive and not exceed total possible marks."))
    } else {
      (true, None)
    }
  }

  def getStudentInfoWithRetry(): (String, Int, Int, Double, Char) = {
    var valid = false
    var name = ""
    var marks = 0
    var totalMarks = 0

    while (!valid) {
      val studentInfo = getStudentInfo
      name = studentInfo._1
      marks = studentInfo._2
      totalMarks = studentInfo._3
      val (isValid, errorMessage) = validateInput(name, marks, totalMarks)
      if (isValid) {
        valid = true
      } else {
        println(errorMessage.get)
      }
    }

    val percentage = (marks.toDouble / totalMarks) * 100
    val grade = calculateGrade(percentage)
    (name, marks, totalMarks, percentage, grade)
  }
}
