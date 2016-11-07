import com.battleship._
import org.scalatest.FunSuite

class BoardTest extends FunSuite {

  val standardNumberOfShips = 3
  val standardBoardSize =(10,10)

  test("A standard board is created") {

    val board = Board(SizeRepository.getStandard,ShipCreator.standard())

    assert(board.size() == standardBoardSize)
    assert(board.shipsLeft() == standardNumberOfShips)
  }

  test("Standard ships are created"){

    val ships = ShipCreator.standard()
    assert(ships.length == standardNumberOfShips)
    assert(ships(0).shipType == ShipType.Destroyer)
    assert(ships(1).shipType == ShipType.Destroyer)
    assert(ships(2).shipType == ShipType.Battleship)

  }

  test("Standard ships are placed"){
    val ships = ShipCreator.standard()

  }

}
