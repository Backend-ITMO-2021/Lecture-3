package ru.ifmo.backend_2021.markup

import ru.ifmo.backend_2021.fileutils.FileUtils

abstract class SomeMarkdown(val elements: Array[Markdowns], val markChar: String) extends Markdowns {
  override def toMarkdown(output: StringBuilder): StringBuilder = {
    output.append(markChar)
    for (e <- elements) {
      e.toMarkdown(output)
    }
    output.append(markChar)
    output
  }
}
