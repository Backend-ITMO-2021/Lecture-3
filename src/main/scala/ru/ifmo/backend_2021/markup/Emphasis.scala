package ru.ifmo.backend_2021.markup;

class Emphasis(override val elements: Array[MarkdownElementBasic],
	override val symbolToAdd: String = "*")
	extends MarkdownElement