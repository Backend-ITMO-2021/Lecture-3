package ru.ifmo.backend_2021.markup
import scala.collection.mutable
import ru.ifmo.backend_2021.fileutils.FileUtils

trait Markable {
  def toMarkdown(sb: mutable.StringBuilder): mutable.StringBuilder
  def toFile(fileName: String): Unit = {
    val fileUtils = new FileUtils()
    fileUtils.withFileWriter(fileName) {
      writer => writer.write(toMarkdown(new mutable.StringBuilder()).toString())
    }
  }
}
