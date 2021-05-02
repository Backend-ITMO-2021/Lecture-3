package ru.ifmo.backend_2021.markup;

trait MarkdownElement extends MarkdownElementBasic {
	val elements: Array[MarkdownElementBasic]
	val symbolToAdd: String = ""

    override def toMarkdown(str: StringBuilder): StringBuilder = {
        str.append(symbolToAdd);
        elements.foreach(_.toMarkdown(str))
        str.append(symbolToAdd);
        str
	}
}