package kyu4

import kyu4.kyu4_SnailSort.{clockwiseListBuilder}
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class kyu4_SnailSortTest extends AnyWordSpec with Matchers {

  "Function: clockwiseListBuilder with size 2x2" should {
    "return the List of Int" in {
      val testMatrix     = List(List(1, 2), List(3, 4))
      val expectedResult = List(1, 2, 4, 3)
      val actualResult   = clockwiseListBuilder(testMatrix, testMatrix.size)
      actualResult shouldBe expectedResult
    }
  }

  "Function: clockwiseListBuilder with size 3x3" should {
    "return the List of Int" in {
      val testMatrix     = List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9))
      val expectedResult = List(1, 2, 3, 6, 9, 8, 7, 4, 5)
      val actualResult   = clockwiseListBuilder(testMatrix, testMatrix.size)
      actualResult shouldBe expectedResult
    }
  }

  "Function: clockwiseListBuilder with size 4x4" should {
    "return the List of Int" in {
      val testMatrix = List(
        List(1, 2, 3, 4),
        List(5, 6, 7, 8),
        List(9, 10, 11, 12),
        List(12, 13, 14, 15)
      )
      val expectedResult = List(1, 2, 3, 4, 8, 12, 15, 14, 13, 12, 9, 5, 6, 7, 11, 10)
      val actualResult   = clockwiseListBuilder(testMatrix, testMatrix.size)
      actualResult shouldBe expectedResult
    }
  }

  "Function: clockwiseListBuilder with size 5x5" should {
    "return the List of Int" in {
      val testMatrix = List(
        List(1, 2, 3, 4, 5),
        List(6, 7, 8, 9, 10),
        List(11, 12, 13, 14, 15),
        List(16, 17, 18, 19, 20),
        List(21, 22, 23, 24, 25)
      )
      val expectedResult =
        List(1, 2, 3, 4, 5, 10, 15, 20, 25, 24, 23, 22, 21, 16, 11, 6, 7, 8, 9, 14, 19, 18, 17, 12, 13)
      val actualResult = clockwiseListBuilder(testMatrix, testMatrix.size)
      actualResult shouldBe expectedResult
    }
  }

}
