package ru.ifmo.backend_2021.markup

import ru.ifmo.backend_2021.fileutils.FileUtils

trait Block {
  def toMarkdown(sb: StringBuilder): StringBuilder

  def toFile(filename: String): Unit = {
    val fileUtils = new FileUtils()
    fileUtils.withFileWriter(filename) { writer =>
      writer.write(this.toMarkdown(new StringBuilder("")).toString() + "\n")
    }
  }
}
