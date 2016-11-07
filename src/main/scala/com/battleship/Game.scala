package com.battleship


object Game {

  def createBoard(boardType : BoardStrategy): Board ={

    boardType match {
      case board : StandardStrategy => Board(board.init(),ShipCreator.standard())
    }
  }

}


