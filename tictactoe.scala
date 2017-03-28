/**
  * Created by kiper on 21.03.17.
  */


class tictactoe {
  val table = Array(" ", " ", " ", " ", " ", " ", " ", " ", " ")

  def printTable() {
    println("-------------")
    print("| ")
    for (i <- 0 until table.length / 3) {
      print(table(i))
      print(" | ")
    }
    println()
    print("| ")
    for (i <- 3 until table.length / 3 + 3) {
      print(table(i))
      print(" | ")
    }
    println()
    print("| ")
    for (i <- 6 until table.length / 3 + 6) {
      print(table(i))
      print(" | ")
    }
    println()
    println("-------------")
  }

  def gameOver(): Boolean = {
    if (table(0) == "x" && table(1) == "x" && table(2) == "x") {
      println("GAME OVER")
      return true
    } else if (table(3) == "x" && table(4) == "x" && table(5) == "x") {
      println("GAME OVER")
      return true
    } else if (table(6) == "x" && table(7) == "x" && table(8) == "x") {
      println("GAME OVER")
      return true
    } else if (table(0) == "x" && table(3) == "x" && table(6) == "x") {
      println("GAME OVER")
      return true
    } else if (table(1) == "x" && table(4) == "x" && table(7) == "x") {
      println("GAME OVER")
      return true
    } else if (table(2) == "x" && table(5) == "x" && table(8) == "x") {
      println("GAME OVER")
      return true
    } else if (table(0) == "x" && table(4) == "x" && table(8) == "x") {
      println("GAME OVER")
      return true
    } else if (table(2) == "x" && table(4) == "x" && table(6) == "x") {
      println("GAME OVER")
      return true
    }

    if (table(0) == "o" && table(1) == "o" && table(2) == "o") {
      println("GAME OVER")
      return true
    } else if (table(3) == "o" && table(4) == "o" && table(5) == "o") {
      println("GAME OVER")
      return true
    } else if (table(6) == "o" && table(7) == "o" && table(8) == "o") {
      println("GAME OVER")
      return true
    } else if (table(0) == "o" && table(3) == "o" && table(6) == "o") {
      println("GAME OVER")
      return true
    } else if (table(1) == "o" && table(4) == "o" && table(7) == "o") {
      println("GAME OVER")
      return true
    } else if (table(2) == "o" && table(5) == "o" && table(8) == "o") {
      println("GAME OVER")
      return true
    } else if (table(0) == "o" && table(4) == "o" && table(8) == "o") {
      println("GAME OVER")
      return true
    } else if (table(2) == "o" && table(4) == "o" && table(6) == "o") {
      println("GAME OVER")
      return true
    }

    if (table(0) != " " && table(1) != " " && table(2) != " " && table(3) != " " && table(4) != " " && table(5) != " " && table(6) != " " && table(7) != " " && table(8) != " ") {
      println("GAME OVER")
      return true
    }

    return false
  }

  def move(s: String): Unit = {
    print(s+":")
    var i = scala.io.StdIn.readLine()

    table(i.toInt) = s
    printTable()
  }

  def play() {

    while (true) {
      move("x")
      if (gameOver()) {
        return
      }
      move("o")
      if (gameOver()) {
        return
      }
    }
  }
}

val game = new tictactoe
game.play()