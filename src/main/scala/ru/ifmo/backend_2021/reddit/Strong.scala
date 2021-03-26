package ru.ifmo.backend_2021.markup

class Strong(elements: Array[MarkdownElement]) extends MarkdownElement {

  override def toMarkdown(stringBuilder: StringBuilder): StringBuilder = {
    stringBuilder.append("__")

    for (element <- elements) {
      element.toMarkdown(stringBuilder)
    }

    return stringBuilder.append("__")
  }
}
