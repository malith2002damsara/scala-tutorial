package Practical_3

object Q2 {

  def main(args: Array[String]): Unit = {

    val inputList = List("malith", "sasila", "ravi", "madu", "lakmali","kasun")
    val afterList = filter(inputList)
    println(s"Before list : $inputList")
    println(s"After list : $afterList")

  }

    def filter(list: List[String]): List[String] = {
      list.filter(str => str.length > 5)
}
}
