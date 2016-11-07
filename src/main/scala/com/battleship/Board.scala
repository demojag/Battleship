package com.battleship

case class Board(boardSize: BoardSize, ships: List[Ship]) {
  def size(): (Int, Int) = {
    (boardSize._1.length, boardSize._2.length)
  }
  def shipsLeft(): Int ={
    ships.length
  }
}



case class Position(cols: String, rows: Int)


trait BoardStrategy {
  def init(): (List[String], List[Int])
}

class StandardStrategy extends BoardStrategy {
  override def init(): BoardSize = {
   SizeRepository.getStandard
  }
}

object SizeRepository {
  def getStandard: BoardSize ={
    val cols = List[String]("A","B","C","D","E","F","G","H","I","L")
    val rows = List[Int](1,2,3,4,5,6,7,8,9,10)
    (cols,rows)
  }
}


