package ru.ifmo.backend_2021.fizzbuzz

class FizzBuzz {

  def flexibleFizzBuzz(f: String => Unit) = {
    for (i <- 1 to 100) {
      i match {
        case i: Int if ((i % 3) == 0 && (i % 5) == 0) => f("FizzBuzz")
        case i: Int if ((i % 3) == 0) => f("Fizz")
        case i: Int if ((i % 5) == 0) => f("Buzz")
        case i: Int => f(i.toString)
      }
    }
  }

}
