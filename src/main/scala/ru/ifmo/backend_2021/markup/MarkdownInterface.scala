package ru.ifmo.backend_2021.markup

import ru.ifmo.backend_2021.fileutils.FileUtils

trait MarkdownInterface {
  def toMarkdown(result: StringBuilder): StringBuilder

  def toFile(file: String): Unit = {
    val fileUtils = new FileUtils()
    fileUtils.withFileWriter(file) {
      writer => writer.write(toMarkdown(new StringBuilder()).toString())
    }
  }
}

