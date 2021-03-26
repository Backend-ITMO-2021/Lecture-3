package ru.ifmo.backend_2021.fileutils

class Text(var text: String) extends MarkupElement {
  def toMarkdown(str: StringBuilder) = {
    str.append(this.text)
    str
  }
}