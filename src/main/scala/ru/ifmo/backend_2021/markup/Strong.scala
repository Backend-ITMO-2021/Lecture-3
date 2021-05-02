package ru.ifmo.backend_2021.markup;


class Strong(override val elements: Array[MarkdownElementBasic],
	override val symbolToAdd: String = "__")
	extends MarkdownElement