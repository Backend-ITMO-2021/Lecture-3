package ru.ifmo.backend_2021.markup

import java.util


class Strikeout(val c: Array[Markdown], val m: String) extends ABCMarkdown(c, m) {
  def this(children:  Array[Markdown]) {
    this(children, "~")
  }
}