package ru.ifmo.backend_2021.fizzbuzz

class FizzBuzz {
  def flexibleFizzBuzz(func: String => Unit): Unit = {
    (1 until 101).foreach { a: Int =>
      a match {
        case i: Int if (i % 3) == 0 && (i % 5) == 0 => func("FizzBuzz")
        case i: Int if (i % 3) == 0 => func("Fizz")
        case i: Int if (i % 5) == 0 => func("Buzz")
        case i: Int => func(i.toString)
      }
    }
  }
}
