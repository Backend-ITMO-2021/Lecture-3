package ru.ifmo.backend_2021.fizzbuzz
class FizzBuzz {
    val FIZZ = "Fizz";
    val BUZZ = "Buzz";

    def flexibleFizzBuzz(insertedFunc: String => Unit): Unit = {
        for (i <- 1 to 100){
            if (i % 3 == 0 && i % 5 == 0) insertedFunc(FIZZ + BUZZ)
            else if (i % 3 == 0) insertedFunc(FIZZ)
            else if (i % 5 == 0) insertedFunc(BUZZ)
            else insertedFunc(i.toString)
        }
    }
}
