package ru.ifmo.backend_2021.fizzbuzz

class FizzBuzz {
  def flexibleFizzBuzz(s: (String) => Unit) = {
    for(x <- 1 to 100) {
      x match {
        case x if ((x % 3) == 0 && (x % 5) == 0) => s("FizzBuzz")
        case x if ((x % 3) == 0) => s("Fizz")
        case x if ((x % 5) == 0) => s("Buzz")
        case _ => s(x.toString)
      }
    }
  }
}