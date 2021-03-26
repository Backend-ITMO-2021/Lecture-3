package ru.ifmo.backend_2021.fizzbuzz

class FizzBuzz{
  def flexibleFizzBuzz(func: String => Unit): Unit  = {
    for (current <- Range(1, 101)) {
      if (current % 3 == 0 && current % 5 == 0) func("FizzBuzz")
      else if (current % 3 == 0) func("Fizz")
      else if (current % 5 == 0) func("Buzz")
      else func(current.toString)
    }
  }

}
