package ru.ifmo.backend_2021.markup

import java.util
import java.util.List


class Emphasis(override val markDownList: Array[MarkDown]) extends MarkAbstract(markDownList, "*") with MarkDown {
}
