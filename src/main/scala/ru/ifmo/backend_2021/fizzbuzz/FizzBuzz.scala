package ru.ifmo.backend_2021.fizzbuzz

import jdk.internal.net.http.common.Pair.pair

class FizzBuzz {
  def flexibleFizzBuzz(funcP: String => Unit) = {
    val fizz  = "Fizz";
    val buzz = "Buzz";
    (1 to 100).foreach{
      i: Int =>{
        i match {
          case i if i % 3 == 0 && i % 5 == 0 => funcP(fizz + buzz);
          case i if i % 3 == 0 => funcP(fizz);
          case i if i % 5 == 0 => funcP(buzz);
          case default =>funcP(i.toString)
        }
      }
    }

  }

}