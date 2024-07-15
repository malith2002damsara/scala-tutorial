package practical_5

case class Book(title: String, author: String, isbn: String)

object Q2 {

  var library: Set[Book] = Set(
    Book("1984", "George Orwell", "11111"),
    Book("To Kill a Mockingbird", "Harper Lee", "222222"),
    Book("The Great Gatsby", "F. Scott Fitzgerald", "3333333")
  )

  def addBook(book: Book): Unit = {
    library += book
  }

  def removeBookByISBN(isbn: String): Unit = {
    library = library.filterNot(_.isbn == isbn)
  }

  def BookIsInLibrary(isbn: String): Boolean = {
    library.exists(_.isbn == isbn)
  }

  def displayLibrary(): Unit = {
    library.foreach(book => println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}"))
  }

  def searchBookByTitle(title: String): Option[Book] = {
    library.find(_.title.equalsIgnoreCase(title))
  }

  def displayBooksByAuthor(author: String): Unit = {
    library.filter(_.author.equalsIgnoreCase(author)).foreach(book => println(s"Title: ${book.title}, ISBN: ${book.isbn}"))
  }

  def main(args: Array[String]): Unit = {
    var n = true
    while (n) {
      println("Library Management System")
      println()
      println("1. Add Book")
      println("2. Remove Book by ISBN")
      println("3. Check if Book is in Library by ISBN")
      println("4. Display Library Collection")
      println("5. Search for Book by Title")
      println("6. Display Books by Author")
      println("7. Exit")
      print("Enter the your choice : ")

      scala.io.StdIn.readLine().toInt match {
        case 1 =>
          println("Enter book title:")
          val title = scala.io.StdIn.readLine()
          println("Enter book author:")
          val author = scala.io.StdIn.readLine()
          println("Enter book ISBN:")
          val isbn = scala.io.StdIn.readLine()
          addBook(Book(title, author, isbn))
          println(s"Book '$title' added to the library.")

        case 2 =>
          println("Enter book ISBN to remove:")
          val isbn = scala.io.StdIn.readLine()
          removeBookByISBN(isbn)
          println(s"Book with ISBN '$isbn' removed from the library.")

        case 3 =>
          println("Enter book ISBN to check:")
          val isbn = scala.io.StdIn.readLine()
          if (BookIsInLibrary(isbn)) println(s"Book with ISBN '$isbn' is in the library.")
          else println(s"Book with ISBN '$isbn' is not in the library.")

        case 4 =>
          println("Current Library Collection:")
          displayLibrary()

        case 5 =>
          println("Enter book title to search:")
          val title = scala.io.StdIn.readLine()
          searchBookByTitle(title) match {
            case Some(book) => println(s"Book found: Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
            case None => println(s"No book found with title '$title'.")
          }

        case 6 =>
          println("Enter author name to display their books:")
          val author = scala.io.StdIn.readLine()
          println(s"Books by '$author':")
          displayBooksByAuthor(author)

        case 7 =>
          n = false
          println("Exiting Library Management System.")

        case _ =>
          println("Invalid choice")
      }
    }
  }
}
