package ru.ifmo.backend_2021.markup

class Text(val text: String) extends Mark {
  override def toMarkdown(stringBuilder: StringBuilder): StringBuilder = stringBuilder.append(text)
}