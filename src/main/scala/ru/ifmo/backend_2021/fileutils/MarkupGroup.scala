package ru.ifmo.backend_2021.fileutils

import java.util

abstract class MarkupGroup(var specialSymbol: String, var parts: List[MarkupElement]) extends MarkupElement {
  def toMarkdown(str: StringBuilder) = {
    str.append(this.specialSymbol)
    for (element <- parts) {
      element.toMarkdown(str)
    }
    str.append(this.specialSymbol)
  }
}