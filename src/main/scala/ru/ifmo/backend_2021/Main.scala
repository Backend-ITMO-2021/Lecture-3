package ru.ifmo.backend_2021

import ru.ifmo.backend_2021.fizzbuzz.FizzBuzz
import ru.ifmo.backend_2021.markup.{Emphasis, Paragraph, Strikeout, Strong, Text}

import java.util
import java.util.List

object Main {
  // Main Method
  def main(args: Array[String]) {
    ////    println("Hello World!")
    //    val fizzBuzz: FizzBuzz = new FizzBuzz();
    //    fizzBuzz.flexibleFizzBuzz(s => {})
    //    fizzBuzz.flexibleFizzBuzz(s => System.out.print(s + "\n"))

    val paragraph = new Paragraph(Array(
      new Strong(Array(
        new Text("1"),
        new Strikeout(Array(
          new Text("2"),
          new Emphasis(Array(
            new Text("3"),
            new Text("4")
          )),
          new Text("5")
        )),
        new Text("6")
      ))
    ))

    print(paragraph.toMarkdown(new StringBuilder()).toString())

  }
}
