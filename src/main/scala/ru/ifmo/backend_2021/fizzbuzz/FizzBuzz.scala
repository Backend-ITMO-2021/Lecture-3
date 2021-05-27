package ru.ifmo.backend_2021.fizzbuzz

class FizzBuzz {

  def flexibleFizzBuzz(f: String => Unit): Unit = {
    for (i <- Range.inclusive(1, 100)) {
      if (i % 15 == 0) f("FizzBuzz")
      else if (i % 3 == 0) f("Fizz")
      else if (i % 5 == 0) f("Buzz")
      else f(i.toString)
    }
  }
}
