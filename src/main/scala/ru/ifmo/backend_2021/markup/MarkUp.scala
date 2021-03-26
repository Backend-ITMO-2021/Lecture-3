package ru.ifmo.backend_2021.markup

abstract class MarkUp(val symbol: String) extends MarkUpInterface {
  def elementList: Array[MarkUpInterface]

  override def toMarkdown(sb: StringBuilder): StringBuilder = {
    sb.append(symbol)
    elementList.foreach(current => current.toMarkdown(sb))
    sb.append(symbol)
  }
}
