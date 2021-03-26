package ru.ifmo.backend_2021.markup

class Text(var text: String) extends MarkupElement {
  def toMarkdown(str: StringBuilder) = {
    str.appendAll(this.text)
  }
}