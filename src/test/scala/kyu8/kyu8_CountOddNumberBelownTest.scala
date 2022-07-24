package kyu8

import kyu8.kyu8_CountOddNumberBelown.oddCount
import org.scalatest.wordspec.AnyWordSpec

class kyu8_CountOddNumberBelownTest extends AnyWordSpec {

  "Simple Test" should {
    "Give beck the number of odd positive number under n" in {
      assert(oddCount(1) == 0)
      assert(oddCount(2) == 1)
      assert(oddCount(3) == 1)
      assert(oddCount(4) == 2)
      assert(oddCount(5) == 2)
      assert(oddCount(99) == 49)
      assert(oddCount(100) == 50)
      assert(oddCount(101) == 50)
    }
  }

}
