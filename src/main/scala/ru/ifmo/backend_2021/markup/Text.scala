package ru.ifmo.backend_2021.markup

import ru.ifmo.backend_2021.fileutils.FileUtils

class Text(val value: String) extends Markdown {
  override def toMarkdown(str: StringBuilder): StringBuilder = str.append(value)

  override def toFile(fileName: String): Unit = {
    val fileUtils = new FileUtils()
    fileUtils.withFileWriter(fileName) { writer =>
      writer.write(this.toMarkdown(new StringBuilder).toString()+"\n");
    }
  }
}