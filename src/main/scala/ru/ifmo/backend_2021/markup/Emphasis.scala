package ru.ifmo.backend_2021.markup



class Emphasis(override val elements: Array[MarkdownInterface]) extends Markdown(elements, "*") {
}