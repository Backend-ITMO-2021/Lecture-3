package ru.ifmo.backend_2021.markup


class Text(val text: String) extends MarkdownInterface {
  def toMarkdown(result: StringBuilder): StringBuilder = result.append(text)
}
