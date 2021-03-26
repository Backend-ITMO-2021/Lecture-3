package ru.ifmo.backend_2021.fileutils

import java.io.{BufferedReader, BufferedWriter, FileInputStream, FileOutputStream, InputStreamReader, OutputStreamWriter}

class FileUtils {

  def withFileReader(filename: String)(block: BufferedReader => String): String = {
    val reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename)))

    try {
      return block(reader)
    } finally {
      reader.close()
    }
  }

  def withFileWriter(filename: String)(block: BufferedWriter => Unit): Unit = {
    val writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filename)))

    try {
      block(writer)
    } finally {
      writer.close()
    }
  }
}
