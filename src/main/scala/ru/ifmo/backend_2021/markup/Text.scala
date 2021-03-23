package ru.ifmo.backend_2021.markup

class Text(text: String) extends AbstractMarkdown(new Array[AbstractMarkdown](0)) {
  override def toMarkdown(stringBuilder: StringBuilder): StringBuilder = stringBuilder.append(this.text)
}
