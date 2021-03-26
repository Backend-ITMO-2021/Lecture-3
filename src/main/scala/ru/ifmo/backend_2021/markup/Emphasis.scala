package ru.ifmo.backend_2021.markup

class Emphasis(override val parts: Array[MarkupElement]) extends MarkupGroup("*", parts) {
}