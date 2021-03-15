package ru.ifmo.backend_2021.fileutils

import java.io.{BufferedReader, BufferedWriter, FileReader, FileWriter}

class FileUtils {

  def withFileWriter(fileName: String)(writer: java.io.BufferedWriter => Unit): Unit = {
    val writerTemp = new BufferedWriter(new FileWriter(fileName))
    writer(writerTemp)
    writerTemp.close()
  }

  def withFileReader(fileName: String)(reader: java.io.BufferedReader => String): String = {
    val readerTemp = new BufferedReader(new FileReader(fileName))
    val res = reader(readerTemp)
    readerTemp.close()
    res
  }

}
