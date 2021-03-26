package ru.ifmo.backend_2021.markup

import ru.ifmo.backend_2021.fileutils.FileUtils

abstract class MarkupElement {

  def toMarkdown(str: StringBuilder): StringBuilder

  def toFile(name: String): Unit ={
    val fu = new FileUtils()
    fu.withFileWriter(name) { writer =>
      writer.write(toMarkdown(new StringBuilder()).toString)}
  }
}

