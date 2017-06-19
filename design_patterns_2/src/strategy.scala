/**
  * Created by kiper on 19.06.17.
  */

import play.api.libs.json._

//class strategy {
//
//}

class Parser (fileName: String){
  def use(fileName: String): Unit ={
    if (fileName.split(".").takeRight(1) == "cvs") {
      new CVSParser().parse(fileName);
    } else {
      new JsonParser().parse(fileName);
    }
  }
}

class CVSParser(fileName: String) extends Parser(fileName: String){
  def parse(fileName: String): Unit ={
    val bufferedSource = io.Source.fromFile(fileName)
    for (line <- bufferedSource.getLines) {
      val cols = line.split(",").map(_.trim)
      // do whatever you want with the columns here
      println(s"${cols(0)}|${cols(1)}|${cols(2)}|${cols(3)}")
    }
    bufferedSource.close
  }
}

class JsonParser(fileName:String) extends Parser(fileName:String){
  def parse(fileName: String): Unit ={
    val bufferedSource = io.Source.fromFile(fileName)
    Json.Parse(bufferedSource)
  }
}

class Application (fileName: String){
  new Parser(fileName)
}
