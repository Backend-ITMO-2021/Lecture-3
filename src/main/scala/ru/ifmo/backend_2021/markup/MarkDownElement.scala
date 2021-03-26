package ru.ifmo.backend_2021.markup;
import java.util.List;

abstract class MarkDownElement(val elements: Array[TextElement], val symbol: String) extends TextElement {

    def this(elements: Array[TextElement]) = {
        this(elements, "")
    }

    
    override def toMarkdown(sb: StringBuilder): StringBuilder = {
        sb.append(symbol)
        elements.foreach(_.toMarkdown(sb))
        sb.append(symbol)
        sb
    }
}