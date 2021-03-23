package ru.ifmo.backend_2021.markup

trait Markdownable {
  def toMarkdown(stringBuilder: StringBuilder): StringBuilder
}
