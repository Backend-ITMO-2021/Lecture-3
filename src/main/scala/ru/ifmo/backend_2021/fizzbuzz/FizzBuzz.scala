package ru.ifmo.backend_2021.fizzbuzz

class FizzBuzz {
  val FIZZ = "Fizz"
  val BUZZ = "Buzz"

  def flexibleFizzBuzz(callback: (String) => Unit): Unit = {
    (1 to 100).foreach { i: Int =>
      i match {
        case x if x % 3 == 0 && x % 5 == 0 => callback(FIZZ + BUZZ)
        case x if x % 3 == 0 => callback(FIZZ)
        case x if x % 5 == 0 => callback(BUZZ)
        case _ => callback(i.toString)
      }
    }
  }
}
