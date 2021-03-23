package ru.ifmo.backend_2021.markup

abstract class AbstractMarkup(val children: Array[Markup], val mark: String) extends Markup {

  def this(children: Array[Markup]) = {
    this(children, "")
  }

  override def toMarkdown(sb: StringBuilder): StringBuilder = {
    sb.append(mark)
    children.foreach(_.toMarkdown(sb))
    sb.append(mark)
  }
}
