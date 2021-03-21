package ru.ifmo.backend_2021.markup



class Paragraph(val elements: Array[MarkdownInterface]) extends MarkdownInterface {
  override def toMarkdown(stringBuilder: StringBuilder): StringBuilder = {
    for (i <- this.elements.indices) {
      this.elements(i).toMarkdown(stringBuilder)
    }
    stringBuilder
  }
}