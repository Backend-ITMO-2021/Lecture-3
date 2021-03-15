package ru.ifmo.backend_2021.markup

import ru.ifmo.backend_2021.fileutils.FileUtils


class Text(var text: String) extends MarkDown {
  override def toMarkdown(builder: StringBuilder): StringBuilder = {
    builder.append(text)
    builder
  }

  override def toFile(fileName: String): Unit = {
    val fileUtils = new FileUtils()
    fileUtils.withFileWriter(fileName) { writer =>
      writer.write(this.toMarkdown(new StringBuilder).toString()+"\n");
    }
  }
}
