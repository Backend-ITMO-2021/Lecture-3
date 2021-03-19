package ru.ifmo.backend_2021.fileutils
import java.io.File
import java.nio.file.Files.{newBufferedReader, newBufferedWriter}

class FileUtils {

  def withFileReader (path: String)(reader: java.io.BufferedReader => String): String = {
    val fileReader = newBufferedReader(new File(path).toPath)
    val output = new StringBuilder()
    if (fileReader.ready()) {
      output.append(reader(fileReader))
    }
    fileReader.close()
    output.toString()
  }

  def withFileWriter (path: String)(writer: java.io.BufferedWriter => Unit): Unit = {
    val fileWriter = newBufferedWriter(new File(path).toPath)
    writer(fileWriter)
    fileWriter.close()
  }
}
