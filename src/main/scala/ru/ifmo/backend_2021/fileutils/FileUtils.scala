package ru.ifmo.backend_2021.fileutils

import java.io.{BufferedReader, BufferedWriter, File, FileReader, FileWriter, PrintWriter}

class FileUtils {
  def withFileReader(fileName: String)(inputFunc: BufferedReader => String): String = {
    val fr = new FileReader(fileName)
    val br = new BufferedReader(fr)
    val result = inputFunc(br)
    fr.close()

    result
  }

  def withFileWriter(fileName: String)(inputFunc: BufferedWriter=> Unit): Unit = {
    val fr = new FileWriter(fileName)
    val bw = new BufferedWriter(fr)
    inputFunc(bw)
    bw.close()
  }
}
