package ru.ifmo.backend_2021.markup
import ru.ifmo.backend_2021.fileutils.FileUtils

class Text(val text: String) extends AbstractMarkdown {
  def toMarkdown(stringBuild: StringBuilder): StringBuilder = {
    stringBuild.append(text)
    stringBuild
  }

  def toFile(fileName: String): Unit = {
    val file = new FileUtils()
    file.withFileWriter(fileName) { writer =>
      writer.write(this.toMarkdown(new StringBuilder).toString() + "\n");
    }
  }
}
