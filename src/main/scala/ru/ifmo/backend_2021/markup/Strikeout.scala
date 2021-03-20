package ru.ifmo.backend_2021.markup

import java.util

class Strikeout(override val text: Array[Markup]) extends MarkupNode(text) {
  override protected val symbol: String = "~"
}
