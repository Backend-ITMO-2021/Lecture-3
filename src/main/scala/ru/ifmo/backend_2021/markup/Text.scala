package ru.ifmo.backend_2021.markup

class Text(var text: String) extends MarkdownInterface {
  override def toMarkdown(stringBuilder: StringBuilder): StringBuilder = {
    stringBuilder.append(text)
    stringBuilder
  }
}