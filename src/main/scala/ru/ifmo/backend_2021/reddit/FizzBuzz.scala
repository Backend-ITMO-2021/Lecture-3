package ru.ifmo.backend_2021.fizzbuzz

class FizzBuzz {

  def flexibleFizzBuzz(print: String => Unit): Unit = {
    doFlexibleFizzBuzz(print, 1)
  }

  private def doFlexibleFizzBuzz(print: String => Unit, n: Int): Unit = {
    if (n > 100) {
      return
    }

    if (n % 15 == 0) {
      print("FizzBuzz")
    } else if (n % 3 == 0) {
      print("Fizz")
    } else if (n % 5 == 0) {
      print("Buzz")
    } else {
      print(n.toString)
    }

    doFlexibleFizzBuzz(print, n + 1)
  }
}
