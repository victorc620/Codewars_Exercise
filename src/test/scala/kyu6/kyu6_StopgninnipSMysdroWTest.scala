package kyu6
import org.scalatest._
import matchers.should._
import org.scalatest.wordspec.AnyWordSpec
import kyu6_StopgninnipSMysdroW._

class kyu6_StopgninnipSMysdroWTest extends AnyWordSpec with Matchers {

  /*
  spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
  spinWords( "This is a test") => returns "This is a test"
  spinWords( "This is another test" ) => returns "This is rehtona test"
   */

  "Solution" when {

    "spinWords 'Hey fellow warriors'" should {
      "return 'Hey wollef sroirraw'" in {
        spinWords("Hey fellow warriors") shouldEqual "Hey wollef sroirraw"
      }
    }

    "spinWords 'This is a test'" should {
      "return 'This is a test'" in {
        spinWords("This is a test") shouldEqual "This is a test"
      }
    }

    "spinWords 'This is another test'" should {
      "return 'This is rehtona test'" in {
        spinWords("This is another test") shouldEqual "This is rehtona test"
      }
    }

  }

}
