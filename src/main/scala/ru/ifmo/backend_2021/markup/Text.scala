package ru.ifmo.backend_2021.markup

class Text (text: String) extends Markable {
  override def toMarkdown(sb: StringBuilder): StringBuilder = {
    sb.append(text)
  }
}
