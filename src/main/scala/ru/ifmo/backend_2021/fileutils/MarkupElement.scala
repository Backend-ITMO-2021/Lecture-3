package ru.ifmo.backend_2021.fileutils

abstract class MarkupElement {
  def toMarkdown(str: StringBuilder)
}