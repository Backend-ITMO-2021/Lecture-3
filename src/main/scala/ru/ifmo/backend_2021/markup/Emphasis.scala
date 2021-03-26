package ru.ifmo.backend_2021.markup

class Emphasis(override val children: Array[AbstractMarkdown])
    extends Markdown(children, "*") {}
