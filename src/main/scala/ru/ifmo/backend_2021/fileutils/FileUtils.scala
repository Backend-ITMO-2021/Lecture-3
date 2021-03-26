package ru.ifmo.backend_2021.fileutils

import java.io.{BufferedReader, BufferedWriter, FileReader, FileWriter}

class FileUtils {

  def withFileReader(name: String) (func: BufferedReader => String): String = {
    val reader = new BufferedReader(new FileReader(name))
    val text = func(reader)
    reader.close()
    text
  }

  def withFileWriter(name: String) (func: BufferedWriter => Unit): Unit = {
    val writer = new BufferedWriter(new FileWriter(name))
    func(writer)
    writer.close()
  }

}
