package ru.ifmo.backend_2021.markup

abstract class MarkupBlock(private val mark: String) extends Block {
  protected val blocksList: Array[Block]

  override def toMarkdown(sb: StringBuilder): StringBuilder = {
    sb.append(this.mark)
    for (block <- this.blocksList) block.toMarkdown(sb)
    sb.append(this.mark)
  }
}
