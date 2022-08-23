package kyu6

object kyu6_FindTheOddInt extends App {

  def findOdd(arrayParameter: Seq[Int]): Int = {
    val intCount: Map[Int, Int] = arrayParameter.groupBy(identity).view.mapValues(_.size).toMap
    val intCountOddFilter       = intCount.filter(x => x._2 % 2 != 0)
    val ans                     = intCountOddFilter.head._1
    ans
  }

}
