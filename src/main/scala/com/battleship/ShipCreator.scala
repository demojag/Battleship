package com.battleship

import scala.util.Random


object ShipCreator {

  def standard(): List[Ship] ={
    List(Ship(List(Position("A",1)),ShipType.Destroyer),
      Ship(List(Position("A",1)),ShipType.Destroyer),
      Ship(List(Position("A",1)),ShipType.Battleship))
  }

  def position(size : Int): Unit ={
    val random = new Random
    val vertical = random.nextBoolean()
    val startRow = random.nextInt(10)
    val startCol = random.nextInt(10)

    if(vertical){
      List[Position] = ()
      val boundaries = startCol - 10
    }

  }
}

case class Ship(space: List[Position], shipType: String)

object ShipType extends Enumeration{
  val Destroyer = "Destroyer"
  val Battleship = "Battleship"
}