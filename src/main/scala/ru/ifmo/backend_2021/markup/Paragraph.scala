package ru.ifmo.backend_2021.markup


class Paragraph(val text: Array[Markup]) extends Markup {
  override def toMarkdown(stringBuilder: StringBuilder): StringBuilder = {
    text.foreach(_.toMarkdown(stringBuilder))
    stringBuilder
  }
}
