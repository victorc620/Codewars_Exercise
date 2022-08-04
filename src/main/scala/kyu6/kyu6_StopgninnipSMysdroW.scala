package kyu6

object kyu6_StopgninnipSMysdroW extends App {

  /*
  Write a function that takes in a string of one or more words,
  and returns the same string, but with all five or more letter
  words reversed (Just like the name of this Kata).
  Strings passed in will consist of only letters and spaces.
  Spaces will be included only when more than one word is present.

  Examples:
  spinWords( "Hey fellow warriors" )
  => returns "Hey wollef sroirraw" spinWords( "This is a test")
  => returns "This is a test" spinWords( "This is another test" )
  => returns "This is rehtona test"
   */

  def spinWords(sentence: String) = {
    val wordList = sentence.split(" ")

    val reversedWordList = wordList.map {
      case x if x.length >= 5 => x.reverse
      case x                  => x
    }

    reversedWordList.mkString(" ")
  }

  println(spinWords("Hey fellow warriors"))

}
