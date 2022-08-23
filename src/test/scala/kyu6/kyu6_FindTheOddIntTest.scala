package kyu6

import kyu6.kyu6_FindTheOddInt.findOdd
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

/** Given an array of integers, find the one that appears an odd number of times.
  * There will always be only one integer that appears an odd number of times.
  *
  * [7] should return 7, because it occurs 1 time (which is odd).
  * [0] should return 0, because it occurs 1 time (which is odd).
  * [1,1,2] should return 2, because it occurs 1 time (which is odd).
  * [0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
  * [1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).
  */

class kyu6_FindTheOddIntTest extends AnyWordSpec with Matchers {

  "Solution" when {

    "arrayParameter = Seq(7)" should {
      "return 7" in {
        findOdd(Seq(7)) shouldEqual 7
      }
    }

    "arrayParameter = Seq(0)" should {
      "return 0" in {
        findOdd(Seq(0)) shouldEqual 0
      }
    }

    "arrayParameter = Seq(1,1,2)" should {
      "return 2" in {
        findOdd(Seq(1, 1, 2)) shouldEqual 2
      }
    }

    "arrayParameter = Seq(0,1,0,1,0)" should {
      "return 0" in {
        findOdd(Seq(0, 1, 0, 1, 0)) shouldEqual 0
      }
    }

    "arrayParameter = Seq(1,2,2,3,3,3,4,3,3,3,2,2,1)" should {
      "return 4" in {
        findOdd(Seq(1, 2, 2, 3, 3, 3, 4, 3, 3, 3, 2, 2, 1)) shouldEqual 4
      }
    }

  }
}
