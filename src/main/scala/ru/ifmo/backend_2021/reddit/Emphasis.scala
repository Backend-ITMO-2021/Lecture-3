package ru.ifmo.backend_2021.markup

class Emphasis(elements: Array[MarkdownElement]) extends MarkdownElement {

  override def toMarkdown(stringBuilder: StringBuilder): StringBuilder = {
    stringBuilder.append("*")

    for (element <- elements) {
      element.toMarkdown(stringBuilder)
    }

    return stringBuilder.append("*")
  }
}
