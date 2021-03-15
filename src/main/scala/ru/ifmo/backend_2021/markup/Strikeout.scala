package ru.ifmo.backend_2021.markup


import java.util
import java.util.List


class Strikeout(override val markDownList: Array[MarkDown]) extends MarkAbstract(markDownList, "~") {
}
