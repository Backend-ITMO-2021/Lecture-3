package ru.ifmo.backend_2021.fileutils

import java.io.{BufferedReader, BufferedWriter, File, FileReader, PrintWriter}

class FileUtils {
  def withFileReader(fileName: String)(callback: BufferedReader => String): String = {
    val fileReader = new BufferedReader(new FileReader(fileName))
    try {
      callback(fileReader)
    }
    finally {
      fileReader.close()
    }
  }

  def withFileWriter(fileName: String)(callback: BufferedWriter => Unit): Unit = {
    val fileWriter = new BufferedWriter(new PrintWriter(new File(fileName)))
    try {
      callback(fileWriter)
    }
    finally {
      fileWriter.close()
    }
  }
}
