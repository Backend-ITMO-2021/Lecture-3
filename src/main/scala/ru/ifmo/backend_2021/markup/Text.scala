package ru.ifmo.backend_2021.markup;

class Text(val text: String = "") extends MarkdownElementBasic {
	override def toMarkdown(str: StringBuilder): StringBuilder = {
		str.append(text)
		str
	}

}
