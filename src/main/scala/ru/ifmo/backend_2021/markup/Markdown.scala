package ru.ifmo.backend_2021.markup
import ru.ifmo.backend_2021.fileutils.FileUtils

abstract class Markdown(val elems: Array[CustomMarkdown], val sign: String) extends CustomMarkdown {
  def toMarkdown(output: StringBuilder): StringBuilder = {
    output.append(sign)
    for (elem <- elems) {
      elem.toMarkdown(output)
    }
    output.append(sign)
    output
  }

  def toFile(path: String): Unit = {
    val file = new FileUtils()
    file.withFileWriter(path) { writer =>
      writer.write(toMarkdown(new StringBuilder()).toString());
      writer.newLine()
    }
  }
}
