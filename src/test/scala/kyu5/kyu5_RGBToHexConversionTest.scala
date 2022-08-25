package kyu5

import kyu5.kyu5_RGBToHexConversion.rgb
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class kyu5_RGBToHexConversionTest extends AnyWordSpec with Matchers {

  def solutionTest(inputR: Int, inputG: Int, inputB: Int, expectedReturn: String): Unit =
    s"Input with r=$inputR, g=$inputG, b=$inputB" should {
      s"return $expectedReturn" in {
        assert(rgb(inputR, inputG, inputB) == expectedReturn)
      }
    }

  solutionTest(255, 255, 255, "FFFFFF")
  solutionTest(255, 255, 300, "FFFFFF")
  solutionTest(0, 0, 0, "000000")
  solutionTest(148, 0, 211, "9400D3")

}
