package kyu5
import org.scalatest._
import matchers.should._
import org.scalatest.wordspec.AnyWordSpec
import kyu5_DirReduction.dirReduc

class kyu5_DirReductionTest extends AnyWordSpec with Matchers {

  "Direction: Array(North)" should {
    "return Array(North)" in {
      dirReduc(Array("North")) shouldEqual Array("North")
    }
  }

  "Direction: Array(East)" should {
    "return Array(East)" in {
      dirReduc(Array("East")) shouldEqual Array("East")
    }
  }

  "Direction: Array(South)" should {
    "return Array(South)" in {
      dirReduc(Array("South")) shouldEqual Array("South")
    }
  }

  "Direction: Array(West)" should {
    "return Array(West)" in {
      dirReduc(Array("West")) shouldEqual Array("West")
    }
  }

  "Direction: Array()" should {
    "return Array()" in {
      dirReduc(Array()) shouldEqual Array()
    }
  }

  "Direction: Array(XXX)" should {
    "return NoSuchElementException" in {
      assertThrows[NoSuchElementException](dirReduc(Array("XXX")))
    }
  }

  "Direction: Array()" should {
    "return NoSuchElementException" in {
      assertThrows[NoSuchElementException](dirReduc(Array("")))
    }
  }

  "Direction: Array(North, South)" should {
    "return Array()" in {
      dirReduc(Array("North", "South")) shouldEqual Array()
    }
  }

}
