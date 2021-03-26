package ru.ifmo.backend_2021.fizzbuzz

class FizzBuzz {

  def flexibleFizzBuzz(callback: String => Unit): Unit = {
    for (i <- Range.inclusive(1, 100)) {
      if (i % 3 == 0 && i % 5 == 0) callback("FizzBuzz")
      else if (i % 3 == 0) callback("Fizz")
      else if (i % 5 == 0) callback("Buzz")
      else callback(i.toString)
    }
  }

}
