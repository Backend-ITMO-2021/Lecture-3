package ru.ifmo.backend_2021.markup

abstract class MarkDownElement(elementsList: Array[Markable]) extends Markable {
  protected val symbol: String

  override def toMarkdown(sb: StringBuilder): StringBuilder = {
    sb.append(symbol)
    for (element <- elementsList){
      element.toMarkdown(sb)
    }
    sb.append(symbol)
    sb
  }
}
