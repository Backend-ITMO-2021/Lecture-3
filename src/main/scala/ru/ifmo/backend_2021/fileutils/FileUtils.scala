package ru.ifmo.backend_2021.fileutils

import java.io.{BufferedReader, BufferedWriter}
import java.nio.file.Files.{newBufferedReader, newBufferedWriter}
import java.nio.file.Paths


class FileUtils {
  def withFileReader(filename: String)(f: BufferedReader => String): String = {
    val reader: BufferedReader = newBufferedReader(Paths.get(filename))
    val result: String = f(reader)
    reader.close()
    result
  }

  def withFileWriter(filename: String)(f: BufferedWriter => Unit): Unit = {
    val writer: BufferedWriter = newBufferedWriter(Paths.get(filename))
    f(writer)
    writer.close()
  }
}
