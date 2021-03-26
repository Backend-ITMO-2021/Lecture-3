package ru.ifmo.backend_2021.fileutils

import java.util

class Emphasis(override val parts: List[MarkupElement]) extends MarkupGroup("*", parts) {
}