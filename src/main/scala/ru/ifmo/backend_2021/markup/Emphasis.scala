package ru.ifmo.backend_2021.markup

class Emphasis(elementList: Array[Markable]) extends MarkDownElement(elementList) {
  override protected val symbol: String = "*"
}
