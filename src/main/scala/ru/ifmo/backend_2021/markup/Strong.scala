package ru.ifmo.backend_2021.markup

class Strong(elementList: Array[Markable]) extends MarkDownElement(elementList) {
  override protected val symbol: String = "__"
}
