package kyu8
import kyu8_SquareNSum.squareSum
import org.scalatest.wordspec.AnyWordSpec

class kyu8_SquareNSumTest extends AnyWordSpec {

  "Test for square(n) Sum" should {
    "return an int of the sum of the square of each element in the list " in {
      assert(squareSum(List(1, 2, 2)) == 9)
      assert(squareSum(List(0, 3, 4, 5)) == 50)
      assert(squareSum(List()) === 0)
    }
  }

}
