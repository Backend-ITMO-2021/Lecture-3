package ru.ifmo.backend_2021.markup

import ru.ifmo.backend_2021.fileutils.FileUtils

abstract class AbstractMarkdown (val innerElements: Array[AbstractMarkdown], val SYMBOL: String) extends Markdownable {
  def this(innerElements: Array[AbstractMarkdown]) = this(innerElements ,"")

  override def toMarkdown(stringBuilder: StringBuilder): StringBuilder = {
    if (this.SYMBOL != "") stringBuilder.append(this.SYMBOL)
    innerElements.foreach(innerElement => {
      innerElement.toMarkdown(stringBuilder)
    })
    if (this.SYMBOL != "") stringBuilder.append(this.SYMBOL)

    stringBuilder
  }

  def toFile(fileName: String): Unit = {
    val fileUtils = new FileUtils()
    fileUtils.withFileWriter(fileName) { writer => {
      writer.write(toMarkdown(new StringBuilder()).toString())
    }}
  }
}
