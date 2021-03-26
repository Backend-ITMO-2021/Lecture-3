package ru.ifmo.backend_2021.markup

class Text(content: String) extends MarkdownElement {

  override def toMarkdown(stringBuilder: StringBuilder): StringBuilder = {
    return stringBuilder.append(content)
  }
}
