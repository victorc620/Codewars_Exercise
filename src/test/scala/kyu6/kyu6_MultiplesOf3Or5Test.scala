package kyu6
import org.scalatest._
import matchers.should._
import kyu6_MultiplesOf3Or5.solution
import org.scalatest.wordspec.AnyWordSpec

class kyu6_MultiplesOf3Or5Test extends AnyWordSpec with Matchers {

//  "Simple Test" should {
//    "Give beck 23 when number is 10" in {
//      assert(solution(10) == 23)
//    }
//  }
  "Solution" when {
    "when passed in a number" should {
      "return 23 for n = 10" in {
        solution(10) shouldEqual 23
      }
      "return 0 for n = 0" in {
        solution(0) shouldEqual 0
      }
      "should return 45 for n = 15" in {
        solution(15) shouldEqual 45
      }
      "should return 2333316668 for n = 100000" in {
        solution(100000) shouldEqual 2333316668L
      }
    }
  }

}
