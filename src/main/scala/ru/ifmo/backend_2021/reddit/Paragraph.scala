package ru.ifmo.backend_2021.markup

class Paragraph(elements: Array[MarkdownElement]) extends MarkdownElement {

  override def toMarkdown(stringBuilder: StringBuilder): StringBuilder = {
    for (element <- elements) {
      element.toMarkdown(stringBuilder)
    }

    return stringBuilder
  }
}
