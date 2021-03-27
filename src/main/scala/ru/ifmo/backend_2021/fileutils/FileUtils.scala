package ru.ifmo.backend_2021.fileutils

import java.io.{BufferedReader, FileReader, BufferedWriter, FileWriter}

class FileUtils {
  def withFileReader(fileName: String)(reader: java.io.BufferedReader => String): String = {
    val fileReader = new BufferedReader(new FileReader(fileName))
    try reader(fileReader) finally fileReader.close()
  }

  def withFileWriter(fileName: String)(writer: java.io.BufferedWriter => Unit): Unit = {
    val fileWriter = new BufferedWriter(new FileWriter(fileName))
    try writer(fileWriter) finally fileWriter.close()
  }
}
