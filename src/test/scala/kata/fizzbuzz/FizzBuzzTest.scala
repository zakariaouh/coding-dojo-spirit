package kata.fizzbuzz

import org.scalatest.{FlatSpec, Matchers}


/*
For a given natural number greater than zero return:
* "fizz" if the number is dividable by 3
* "buzz" if the number is dividable by 5
* "fizzbuzz" if the number is dividable by 15
* the same number if no other requirement is fulfilled
 */
class FizzBuzzTest extends FlatSpec with Matchers {

  behavior of "FizzBuzz"

  it should "return fizz if the number is 3" in {
    FizzBuzz.getResult(3) should be ("fizz")
  }

  it should "return 1 if the number is 1" in {
    FizzBuzz.getResult(1) should be ("1")
  }

  it should "return 2 if the number is 2" in {
    FizzBuzz.getResult(2) should be ("2")
  }

  it should "return buzz if the number is 5" in {
    FizzBuzz.getResult(5) should be ("buzz")
  }

  it should "return fizz if the number is 6" in {
    FizzBuzz.getResult(6) should be ("fizz")
  }

  it should "return fizz if the number is 9" in {
    FizzBuzz.getResult(9) should be ("fizz")
  }

  it should "return buzz if the number is 10" in {
    FizzBuzz.getResult(10) should be ("buzz")
  }

  it should "return fizzbuzz if the number is 15" in {
    FizzBuzz.getResult(15) should be ("fizzbuzz")
  }





}