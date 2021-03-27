package ru.ifmo.backend_2021.markup

class Text(val text: String) extends Markdowns {
  override def toMarkdown(output: StringBuilder): StringBuilder = {
    output.append(text)
    output
  }
}
