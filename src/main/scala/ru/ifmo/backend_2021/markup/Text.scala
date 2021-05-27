package ru.ifmo.backend_2021.markup

class Text(private val string: String) extends Block() {
  override def toMarkdown(sb: StringBuilder): StringBuilder = {
    sb.append(this.string)
  }
}
