package ru.ifmo.backend_2021.markup;

class Strikeout(override val elements: Array[MarkdownElementBasic],
	override val symbolToAdd: String = "~")
	extends MarkdownElement