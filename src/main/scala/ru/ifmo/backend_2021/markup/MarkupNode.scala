package ru.ifmo.backend_2021.markup


abstract class MarkupNode(val text: Array[Markup]) extends Markup {
  protected val symbol: String

  override def toMarkdown(stringBuilder: StringBuilder): StringBuilder = {
    stringBuilder.appendAll(symbol)
    text.foreach(_.toMarkdown(stringBuilder))
    stringBuilder.appendAll(symbol)
    stringBuilder
  }
}
