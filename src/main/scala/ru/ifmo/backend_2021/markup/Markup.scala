package ru.ifmo.backend_2021.markup

import ru.ifmo.backend_2021.fileutils.FileUtils

trait Markup {
  def toMarkdown(stringBuilder: StringBuilder): StringBuilder

  def toFile(fileName: String): Unit = {
    val fileUtils = new FileUtils()
    fileUtils.withFileWriter(fileName) { writer =>
      writer.write(toMarkdown(new StringBuilder()).toString())
    }
  }
}
