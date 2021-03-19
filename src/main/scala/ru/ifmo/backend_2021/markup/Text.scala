package ru.ifmo.backend_2021.markup

import ru.ifmo.backend_2021.fileutils.FileUtils

class Text(val text: String) extends CustomMarkdown {
  def toMarkdown(output: StringBuilder): StringBuilder = {
    output.append(text)
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
