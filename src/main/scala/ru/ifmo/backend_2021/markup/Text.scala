package ru.ifmo.backend_2021.markup

class Text(var text: String) extends MarkUpInterface {
  override def toMarkdown(sb: StringBuilder): StringBuilder = sb.append(text)
}
