package ru.ifmo.backend_2021.markup

import java.util

class Strong(override val text: Array[Markup]) extends MarkupNode(text) {
  override protected val symbol: String = "__"
}
