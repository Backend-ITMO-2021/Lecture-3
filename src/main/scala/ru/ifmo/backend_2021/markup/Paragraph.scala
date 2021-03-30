package ru.ifmo.backend_2021.markup

class Paragraph (elementList: Array[Markable]) extends Markable {
  override def toMarkdown(sb: StringBuilder): StringBuilder = {
    for (element <- elementList) {
      element.toMarkdown(sb)
    }
    sb
  }
}
