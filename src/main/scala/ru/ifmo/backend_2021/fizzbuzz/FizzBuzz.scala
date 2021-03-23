package ru.ifmo.backend_2021.fizzbuzz

class FizzBuzz {
  def flexibleFizzBuzz(inputFunc: (String) => Unit) = {
    for (i <- 1 to 100) {
      if (i % 3 == 0 && i % 5 == 0) {
        inputFunc("FizzBuzz")
      } else if (i  % 3 == 0) {
        inputFunc("Fizz")
      } else if (i % 5 == 0) {
        inputFunc("Buzz")
      } else inputFunc(i.toString)
    }
  }

}
