package ru.ifmo.backend_2021.markup
import ru.ifmo.backend_2021.fileutils.FileUtils

abstract class Markdown(val children: Array[AbstractMarkdown], val MARK: String)
    extends AbstractMarkdown {

  def toMarkdown(stringBuild: StringBuilder): StringBuilder = {
    stringBuild.append(MARK);
    children.foreach(_.toMarkdown(stringBuild));
    stringBuild.append(MARK);
    stringBuild
  }

  def toFile(fileName: String): Unit = {
    val file = new FileUtils()
    file.withFileWriter(fileName) { writer =>
      writer.write(this.toMarkdown(new StringBuilder).toString() + "\n");
    }
  }
}
