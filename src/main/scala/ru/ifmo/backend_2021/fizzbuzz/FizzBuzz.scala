package ru.ifmo.backend_2021.fizzbuzz

class FizzBuzz {

  def flexibleFizzBuzz(function: String => Unit): Unit = {
    for (num <- Range(1, 101)){
      if (num % 15 == 0 ) {
        function("FizzBuzz")
      } else if (num % 3 == 0) {
        function("Fizz")
      } else if (num % 5 == 0) {
        function("Buzz")
      } else {
        function(num.toString)
      }
    }
  }
}