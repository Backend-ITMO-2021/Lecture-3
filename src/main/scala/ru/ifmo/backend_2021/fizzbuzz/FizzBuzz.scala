package ru.ifmo.backend_2021.fizzbuzz

class FizzBuzz {
  def flexibleFizzBuzz(action: String => Unit): Unit = (1 to 100).map(x => (x % 3, x % 5) match {
    case (0, 0) => action("FizzBuzz")
    case (0, _) => action("Fizz")
    case (_, 0) => action("Buzz")
    case _ => action(x.toString)
  })
}
