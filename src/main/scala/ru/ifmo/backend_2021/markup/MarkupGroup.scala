package ru.ifmo.backend_2021.markup

abstract class MarkupGroup(val specialSymbol: String, val parts: Array[MarkupElement]) extends MarkupElement {
  def toMarkdown(str: StringBuilder): StringBuilder = {
    str.appendAll(this.specialSymbol)
    for (element <- parts) {
      element.toMarkdown(str)
    }
    str.appendAll(this.specialSymbol)
  }
}