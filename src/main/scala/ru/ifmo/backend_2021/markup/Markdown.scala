package ru.ifmo.backend_2021.markup


abstract class Markdown(val elements: Array[MarkdownInterface]) extends MarkdownInterface {
  def toMarkdown(result: StringBuilder, border: String): StringBuilder = {
    result.append(border)
    for (cur <- elements)
      cur.toMarkdown(result)
    result.append(border)
    result
  }
}