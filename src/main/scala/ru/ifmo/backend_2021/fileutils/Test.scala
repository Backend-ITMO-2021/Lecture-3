package ru.ifmo.backend_2021.fileutils

object Test {
  def main(args: Array[String]): Unit = {
    val fileUtils = new FileUtils()
    fileUtils.withFileWriter("File.txt") { writer =>
      writer.write("Hello\\n"); writer.write("World!")
    }

  }
}
