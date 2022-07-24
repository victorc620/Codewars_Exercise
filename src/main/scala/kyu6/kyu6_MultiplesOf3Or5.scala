package kyu6

/** If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
  * The sum of these multiples is 23.
  * Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
  * Additionally, if the number is negative, return 0 (for languages that do have them).
  * Note: If the number is a multiple of both 3 and 5, only count it once.
  */

object kyu6_MultiplesOf3Or5 extends App {

  def solution(number: Int): Long = {
    val rangeNList   = List.range(0L, number.toLong) // Turn it to Long instead of Int here to handle large n
    val divisionList = rangeNList.filter(x => (x % 3 == 0 || x % 5 == 0))
    divisionList.sum
  }

//  def sumList(listOfInt: List[Int]): Long =
//    if (listOfInt.isEmpty) 0
//    else listOfInt.head + sumList(listOfInt.tail)

  println(solution(1000000))
}
