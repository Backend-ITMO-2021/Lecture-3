package ru.ifmo.backend_2021.markup

import ru.ifmo.backend_2021.fileutils.FileUtils

import java.util


abstract class ABCMarkdown(val children: Array[Markdown], val mark: String) extends Markdown {
  override def toMarkdown(str: StringBuilder): StringBuilder = {
    str.append(mark)
    children.map((child: Markdown) => child.toMarkdown(str))
    str.append(mark)
    str
  }

  override def toFile(fileName: String): Unit = {
    val fileUtils = new FileUtils()
    fileUtils.withFileWriter(fileName) { writer =>
      writer.write(this.toMarkdown(new StringBuilder).toString()+"\n");
    }
  }
}