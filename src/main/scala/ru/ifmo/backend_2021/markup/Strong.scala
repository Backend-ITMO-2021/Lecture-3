package ru.ifmo.backend_2021.markup

class Strong(override val elements: Array[MarkdownInterface]) extends Markdown(elements) {
  def toMarkdown(result: StringBuilder): StringBuilder = toMarkdown(result, "__")
}
