package ru.ifmo.backend_2021.fizzbuzz

class FizzBuzz {
  def flexibleFizzBuzz(func: String => Unit): Unit = {
    (1 to 100)
      .foreach(i =>
        if (i%3==0 && i%5==0) func("FizzBuzz")
        else if (i%3==0) func("Fizz")
        else if (i%5==0) func("Buzz")
        else func(i.toString)
      )
  }
}