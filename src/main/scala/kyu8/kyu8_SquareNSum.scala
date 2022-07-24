package kyu8

/*
Complete the square sum function so that it squares each number passed into it and then sums the results together.
For example, for [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9.
 */

object kyu8_SquareNSum extends App {

  def squareSum(xs: List[Int]): Int = xs.map(x => x*x).sum

}
