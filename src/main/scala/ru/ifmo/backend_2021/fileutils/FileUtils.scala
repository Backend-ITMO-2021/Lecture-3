package ru.ifmo.backend_2021.fileutils

import java.io.{BufferedReader, BufferedWriter, FileReader, PrintWriter}


class FileUtils {
  def withFileReader(nameFile: String)(read: BufferedReader => String) = {
    var file = new BufferedReader(new FileReader(nameFile))
    var out = new StringBuilder(read(file))
    file.close()
    out.toString()
  }

  def withFileWriter(nameFile: String)(write: BufferedWriter => Unit) = {
    var file = new BufferedWriter(new PrintWriter(nameFile))
    write(file)
    file.close()
  }
}