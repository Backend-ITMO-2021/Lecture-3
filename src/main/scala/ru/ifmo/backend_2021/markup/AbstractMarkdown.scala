package ru.ifmo.backend_2021.markup;

trait AbstractMarkdown {
  def toMarkdown(stringBuild: StringBuilder): StringBuilder
  def toFile(fileName: String): Unit
}
