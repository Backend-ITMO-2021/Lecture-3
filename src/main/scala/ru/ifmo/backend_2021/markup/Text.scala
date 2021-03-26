package ru.ifmo.backend_2021.markup;

class Text(val text: String) extends TextElement {
    override def toMarkdown(sb: StringBuilder): StringBuilder = {
        sb.append(text)
        sb
    }
}
