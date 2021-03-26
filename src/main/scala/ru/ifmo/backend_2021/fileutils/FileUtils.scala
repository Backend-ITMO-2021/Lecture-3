package ru.ifmo.backend_2021.fileutils

import java.io._

class FileUtils {

  def withFileReader(file: String)(reader: BufferedReader => String): String = {
    val fileReader = new BufferedReader(new FileReader(file))
    val content = reader(fileReader)
    fileReader.close()
    content
  }

  def withFileWriter(file: String)(writer: BufferedWriter => Unit): Unit = {
    val fileWriter = new BufferedWriter(new PrintWriter(file))
    writer(fileWriter)
    fileWriter.close()
  }
}
