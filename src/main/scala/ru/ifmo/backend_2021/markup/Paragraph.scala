package ru.ifmo.backend_2021.markup

class Paragraph(override val children: Array[AbstractMarkdown])
    extends Markdown(children, "") {}
