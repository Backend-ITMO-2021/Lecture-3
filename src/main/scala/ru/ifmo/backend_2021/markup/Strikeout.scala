package ru.ifmo.backend_2021.markup

class Strikeout(override val elems: Array[CustomMarkdown]) extends Markdown(elems, "~") {
}
