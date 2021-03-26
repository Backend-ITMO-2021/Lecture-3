package ru.ifmo.backend_2021.markup

import java.util
import java.util.List


class Strong(val c: Array[Markdown], val m: String) extends ABCMarkdown(c, m) {
  def this(children:  Array[Markdown]) {
    this(children, "__")
  }
}