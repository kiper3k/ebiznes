import java.io.FileInputStream
import java.util.Scanner

/**
  * Created by kiper on 19.06.17.
  */


class Reader {
  val scanner = new Scanner(System.in)

  def read(): Unit ={
    scanner.next()
  }
}

class WhitespaceCleanInputReader extends Reader {
  override def read(): Unit = {
    scanner.next().trim()
  }
}

class FileReader(file: String) extends Reader {
  val scanner = new Scanner(new FileInputStream(file))

  def read(): Unit ={
    scanner.next()
  }
}

class UpperCaseFileReader(file: String) extends FileReader(file:String) {
  override def read(): Unit = {
    scanner.next().toUpperCase()
  }
}