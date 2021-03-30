package ru.ifmo.backend_2021.markup


abstract class AbstractMarkup(val children: Array[Mark], val mark: String) extends Mark {


  override def toMarkdown(sb: StringBuilder): StringBuilder = {
    sb.append(mark)
    children.foreach(_.toMarkdown(sb))
    sb.append(mark)
  }
}