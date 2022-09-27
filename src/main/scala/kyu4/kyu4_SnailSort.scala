package kyu4

import scala.::

object kyu4_SnailSort extends App {

  /** Given an n x n array, return the array elements arranged from outermost elements to the middle element, traveling clockwise.
    * e.g.
    * array = [[1,2,3],
    *          [4,5,6],
    *          [7,8,9]]
    * snail(array) #=> [1,2,3,6,9,8,7,4,5]
    *
    * array = [[1,2,3],
    *          [8,9,4],
    *          [7,6,5]]
    * snail(array) #=> [1,2,3,4,5,6,7,8,9]
    *
    * NOTE: The idea is not sort the elements from the lowest value to the highest; the idea is to traverse the 2-d array in a clockwise snailshell pattern.
    * NOTE 2: The 0x0 (empty matrix) is represented as en empty array inside an array [[]].
    *
    * @param xs List[Int] unsorted
    * @return   List[Int] sorted
    */
//  def snail(xs: List[List[Int]]): List[Int] = {
//
//    val n = matrixSize(xs)
//
//    // 2. Implement the clockwise logic
//
//
//  }

  // 1. Count the size of Matrix (for n*n square matrix ONLY)
//  def matrixSize(xs: List[List[Int]]): Int = xs.size

  // 2. Implement the clockwise logic
  def clockwiseListBuilder(xs: List[List[Int]], matrixSize: Int, snailList: List[Int] = List()): List[Int] =
    matrixSize match {
      case 0 => throw new Exception()
      case 1 => snailList ++ xs.head
      case 2 => snailList ++ xs.head ++ xs.last.reverse
      case _ =>
        val acc = snailList ++ xs.head ++ addEdgeElement(xs, xs.size, "right") ++ xs.last.reverse ++ addEdgeElement(
          xs,
          xs.size,
          "left"
        )
        val reducedMatrix = xs.drop(1).dropRight(1).map(x => x.drop(1).dropRight(1))
        clockwiseListBuilder(reducedMatrix, matrixSize - 2, acc)
    }

  // Function to creat a List of the edge element
  def addEdgeElement(xs: List[List[Int]], matrixSize: Int, side: String): List[Int] = {

    val middleSizeList = (0 until matrixSize - 2).toList
    val middleMatrix   = xs.drop(1).dropRight(1)
    if (middleSizeList.size <= 0) List()
    else
      side match {
        case "right" => middleSizeList.foldLeft(List[Int]())((acc, x) => acc :+ middleMatrix(x).last)
        case "left"  => middleSizeList.reverse.foldLeft(List[Int]())((acc, x) => acc :+ middleMatrix(x).head)
        case _       => throw new Exception(s"side: $side is not handled")
      }
  }
}
