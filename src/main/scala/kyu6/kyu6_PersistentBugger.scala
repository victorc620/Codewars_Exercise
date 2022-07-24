package kyu6

object kyu6_PersistentBugger extends App {

  /*
  Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence,
  which is the number of times you must multiply the digits in num until you reach a single digit.

  For example (Input --> Output):

  39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit)
  999 --> 4 (because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2)
  4 --> 0 (because 4 is already a one-digit number)
   */
  //
  //  def persistence(n: Int): Int = {
  //
  //  }

  def counterFunction(n: Int, counter: Int = 0): Int = {
    if (n % 10 == n) counter // only one digit left => return counter
    else {
      val newInt = splitMultiply(n, ans = 1)
      counterFunction(newInt, counter = counter + 1)
    }
  }

  def splitMultiply(n: Int, d1: Int = 10, d2: Int = 1, ans: Int): Int = {
    if (n % d1 == n) ans * (n % d1 / d2)
    else splitMultiply(n, d1 * 10, d2 * 10, ans * (n % d1 / d2))
  }

}
