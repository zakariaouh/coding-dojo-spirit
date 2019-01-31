package kata.fizzbuzz

object FizzBuzz {
  def getResult(i: Int): String =
    if (i % 15 == 0) "fizzbuzz"
    else if (i % 3 == 0) "fizz"
    else if (i % 5 == 0) "buzz"
    else i.toString

}
