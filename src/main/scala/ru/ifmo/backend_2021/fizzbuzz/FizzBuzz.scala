package ru.ifmo.backend_2021.fizzbuzz


class FizzBuzz {
  def flexibleFizzBuzz(func: String => Unit): Seq[Unit] = {
    (1 to 100).map((x: Int) => func(Map(1 -> x.toString, 6 -> "Fizz", 10 -> "Buzz", 0 -> "FizzBuzz")(math.pow(x, 4).toInt % 15)))

  }
}
