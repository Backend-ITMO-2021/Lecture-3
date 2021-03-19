package ru.ifmo.backend_2021.markup

trait CustomMarkdown {
  def toMarkdown(string: StringBuilder): StringBuilder
  def toFile(file: String): Unit
}
