package ru.ifmo.backend_2021.markup



abstract class Markdown(val elements: Array[MarkdownInterface], var sign: String) extends MarkdownInterface {
  override def toMarkdown(stringBuilder: StringBuilder): StringBuilder = {
    stringBuilder.append(sign)
    for (i <- this.elements.indices) {
      this.elements(i).toMarkdown(stringBuilder)
    }
    stringBuilder.append(sign)
    stringBuilder
  }
}