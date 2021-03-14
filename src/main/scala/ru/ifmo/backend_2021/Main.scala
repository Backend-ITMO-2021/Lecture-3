package ru.ifmo.backend_2021

import ru.ifmo.backend_2021.fizzbuzz.FizzBuzz

object Main {
  // Main Method
  def main(args: Array[String]) {
//    println("Hello World!")
    val fizzBuzz: FizzBuzz = new FizzBuzz();
    fizzBuzz.flexibleFizzBuzz(s => {})
    fizzBuzz.flexibleFizzBuzz(s => System.out.print(s + "\n"))
  }
}
