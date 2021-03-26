package ru.ifmo.backend_2021.fileutils

import java.util

class Strikeout(val parts: List[MarkupElement]) extends MarkupGroup("~", parts) {
}