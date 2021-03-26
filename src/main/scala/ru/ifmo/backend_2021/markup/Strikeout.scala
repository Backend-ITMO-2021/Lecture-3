package ru.ifmo.backend_2021.markup

class Strikeout(override val children: Array[AbstractMarkdown])
    extends Markdown(children, "~") {}
