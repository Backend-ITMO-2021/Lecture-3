package ru.ifmo.backend_2021.markup

trait MarkDown {
  def toMarkdown(builder: scala.collection.mutable.StringBuilder): StringBuilder
  def toFile(fileName: String)
}

