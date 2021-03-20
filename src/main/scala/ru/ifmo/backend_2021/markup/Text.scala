package ru.ifmo.backend_2021.markup

class Text(val text: String) extends Markup {
  override def toMarkdown(stringBuilder: StringBuilder): StringBuilder = stringBuilder.appendAll(text)
}
