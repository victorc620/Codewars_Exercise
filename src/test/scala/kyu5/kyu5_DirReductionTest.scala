package kyu5
import org.scalatest._
import matchers.should._
import org.scalatest.wordspec.AnyWordSpec
import kyu5_DirReduction.dirReduc

class kyu5_DirReductionTest extends AnyWordSpec with Matchers {

  "Direction: Array(NORTH)" should {
    "return Array(NORTH)" in {
      dirReduc(Array("NORTH")) shouldEqual Array("NORTH")
    }
  }

  "Direction: Array(EAST)" should {
    "return Array(EAST)" in {
      dirReduc(Array("EAST")) shouldEqual Array("EAST")
    }
  }

  "Direction: Array(SOUTH)" should {
    "return Array(SOUTH)" in {
      dirReduc(Array("SOUTH")) shouldEqual Array("SOUTH")
    }
  }

  "Direction: Array(WEST)" should {
    "return Array(WEST)" in {
      dirReduc(Array("WEST")) shouldEqual Array("WEST")
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

  "Direction: Array(NORTH, SOUTH)" should {
    "return Array()" in {
      dirReduc(Array("NORTH", "SOUTH")) shouldEqual Array()
    }
  }

  "Direction: Array(EAST, WEST)" should {
    "return Array()" in {
      dirReduc(Array("EAST", "WEST")) shouldEqual Array()
    }
  }

  "Direction: Array(SOUTH, NORTH)" should {
    "return Array()" in {
      dirReduc(Array("SOUTH", "NORTH")) shouldEqual Array()
    }
  }

  "Direction: Array(WEST, EAST)" should {
    "return Array()" in {
      dirReduc(Array("WEST", "EAST")) shouldEqual Array()
    }
  }

  "Direction: Array(NORTH, NORTH)" should {
    "return Array(NORTH, NORTH)" in {
      dirReduc(Array("NORTH", "NORTH")) shouldEqual Array("NORTH", "NORTH")
    }
  }

  "Direction: Array(NORTH, NORTH, EAST)" should {
    "return Array(NORTH, NORTH, EAST)" in {
      dirReduc(Array("NORTH", "NORTH", "EAST")) shouldEqual Array("NORTH", "NORTH", "EAST")
    }
  }

  "Direction: Array(NORTH, SOUTH, EAST)" should {
    "return Array(EAST)" in {
      dirReduc(Array("NORTH", "SOUTH", "EAST")) shouldEqual Array("EAST")
    }
  }

  "Direction: Array(NORTH, EAST, SOUTH, WEST)" should {
    "return Array(NORTH, EAST, SOUTH, WEST)" in {
      dirReduc(Array("NORTH", "EAST", "SOUTH", "WEST")) shouldEqual Array("NORTH", "EAST", "SOUTH", "WEST")
    }
  }

  "Direction: Array(NORTH, SOUTH, SOUTH, EAST, WEST, NORTH, WEST)" should {
    "return Array(SOUTH, NORTH, WEST)" in {
      dirReduc(Array("NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST")) shouldEqual Array("WEST")
    }
  }
}
