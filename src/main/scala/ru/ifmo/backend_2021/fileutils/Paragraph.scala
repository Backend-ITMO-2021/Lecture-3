package ru.ifmo.backend_2021.fileutils

import java.util

class Paragraph(override val parts: List[MarkupElement]) extends MarkupGroup("", parts) {
}