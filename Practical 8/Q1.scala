package practical_8

object Q1 {

  def main(args: Array[String]): Unit = {
    val originalText = "ABCDEF"
    val shift = 2

    val encryptedText = cipher(originalText, shift, encrypt)
    println(s"Encrypted Text: $encryptedText")

    val decryptedText = cipher(encryptedText, shift, decrypt)
    println(s"Decrypted Text: $decryptedText")
  }

    def encrypt(text: String, shift: Int): String = {
      text.map { char =>
        if (char.isLetter) {
          val base = if (char.isUpper) 'A' else 'a'
          ((char - base + shift) % 26 + base).toChar
        } else {
          char
        }
      }
    }
    def decrypt(text: String, shift: Int): String = {
      encrypt(text, 26 - (shift % 26))
    }
    def cipher(text: String, shift: Int, operation: (String, Int) => String): String = {
      operation(text, shift)
    }
  }
