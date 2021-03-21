package ru.ifmo.backend_2021.markup

import ru.ifmo.backend_2021.fileutils.FileUtils

trait MarkdownInterface {
  def toMarkdown(stringBuilder: StringBuilder): StringBuilder

  def toFile(nameFile: String) = {
    val file = new FileUtils()
    file.withFileWriter(nameFile) { writer =>
      writer.write(toMarkdown(new StringBuilder()).toString())
    }
  }
}