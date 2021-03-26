
package ru.ifmo.backend_2021.markup

trait Markdown {
  def toMarkdown(builder: scala.collection.mutable.StringBuilder): StringBuilder
  def toFile(fileName: String)
}
