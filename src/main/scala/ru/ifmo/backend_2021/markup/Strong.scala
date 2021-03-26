package ru.ifmo.backend_2021.markup

class Strong(override val children: Array[AbstractMarkdown])
    extends Markdown(children, "__") {}
