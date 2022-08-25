package kyu5

object kyu5_RGBToHexConversion extends App {

  /** The rgb function is incomplete. Complete it so that passing in RGB decimal values will result in a hexadecimal
    * representation being returned. Valid decimal values for RGB are 0 - 255. Any values that fall out of that range
    * must be rounded to the closest valid value.
    *
    * Note: Your answer should always be 6 characters long, the shorthand with 3 will not work here.
    *
    * Example:
    * rgb(255, 255, 255) FFFFFF
    * rgb(255, 255, 300) FFFFFF
    * rgb(0, 0, 0)       000000
    * rgb(148, 0, 211)   9400D3
    *
    * The following are examples of expected output values:
    * @param inputR Int
    * @param inputG Int
    * @param inputB Int
    * @return String
    */
  def rgb(r: Int, g: Int, b: Int): String = Seq(r, g, b).map(x => f"${x.max(0).min(255)}%02X").mkString

}
