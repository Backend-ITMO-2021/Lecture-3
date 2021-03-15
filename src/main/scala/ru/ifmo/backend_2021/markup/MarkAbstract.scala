package ru.ifmo.backend_2021.markup


import ru.ifmo.backend_2021.fileutils.FileUtils

import java.util


abstract class MarkAbstract(val markDownList: Array[MarkDown], val MARK: String) extends MarkDown {
  override def toMarkdown(builder: StringBuilder): StringBuilder = {
    if (markDownList == null) return builder
    builder.append(MARK)
    markDownList.foreach((markDown: MarkDown) => {
      def foo(markDown: MarkDown) = markDown.toMarkdown(builder)

      foo(markDown)
    })
    builder.append(MARK)
    builder
  }

  override def toFile(fileName: String): Unit = {
    val fileUtils = new FileUtils()
    fileUtils.withFileWriter(fileName) { writer =>
      writer.write(this.toMarkdown(new StringBuilder).toString()+"\n");
    }
  }
}
