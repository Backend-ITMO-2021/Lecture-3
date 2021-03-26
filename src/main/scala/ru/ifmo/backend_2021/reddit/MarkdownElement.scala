package ru.ifmo.backend_2021.markup

import ru.ifmo.backend_2021.fileutils.FileUtils

trait MarkdownElement {

  def toMarkdown(stringBuilder: StringBuilder): StringBuilder

  def toFile(filename: String): Unit = {
    new FileUtils().withFileWriter(filename) { writer =>
      writer.write(toMarkdown(new StringBuilder()).toString())
    }
  }
}
