package kyu6

object kyu6_FindTheOddInt extends App {

  def findOdd(arrayParameter: Seq[Int]): Int =
    arrayParameter
      .groupBy(identity)
      .view
      .mapValues(_.size)
      .toMap
      .filter(x => x._2 % 2 != 0)
      .head
      ._1

}
