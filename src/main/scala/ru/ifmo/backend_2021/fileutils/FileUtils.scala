package ru.ifmo.backend_2021.fileutils

import java.io.{BufferedReader, BufferedWriter, FileReader, FileWriter}

class FileUtils {

  def withFileReader(
      fileName: String
  )(reader: BufferedReader => String): String = {
    val readerTemp = new BufferedReader(new FileReader(fileName))
    val result = reader(readerTemp)
    readerTemp.close()
    result.toString()
  }

  def withFileWriter(
      fileName: String
  )(writer: BufferedWriter => Unit): Unit = {
    val writerTemp = new BufferedWriter(new FileWriter(fileName))
    writer(writerTemp)
    writerTemp.close()
  }

}
