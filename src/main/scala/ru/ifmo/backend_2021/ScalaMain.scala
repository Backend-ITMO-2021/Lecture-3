package ru.ifmo.backend_2021
import ru.ifmo.backend_2021.fizzbuzz.FizzBuzz
import ru.ifmo.backend_2021.fileutils.FileUtils
import ru.ifmo.backend_2021.markup._

object ScalaMain {
  def main(args: Array[String]): Unit = {
       val fileUtils = new FileUtils()
        fileUtils.withFileWriter("File.txt") { writer =>
          writer.write("Hello\n"); writer.write("World!")
        }
        val result = fileUtils.withFileReader("File.txt") { reader =>
          reader.readLine() + "\n" + reader.readLine()
        }
        assert(result == "Hello\nWorld!")
        val fizzBuzz = new FizzBuzz()
        fileUtils.withFileWriter("FizzBuzz.txt") { writer =>
          fizzBuzz.flexibleFizzBuzz(s => writer.write(s"$s\n"))
        }

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
      println(paragraph.toMarkdown(new StringBuilder).toString())
  }
}