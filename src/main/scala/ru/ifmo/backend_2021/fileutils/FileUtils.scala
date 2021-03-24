package ru.ifmo.backend_2021.fileutils
import java.io.{BufferedReader, BufferedWriter, File, FileReader, FileWriter, PrintWriter}


class FileUtils {
  def withFileReader(fileName: String)( func: BufferedReader => String): String = {
    val reader = new BufferedReader(new FileReader(fileName))
    val res = func(reader)
    reader.close()
    res
  }
  def withFileWriter(fileName: String)(func: BufferedWriter => Unit): Unit ={
    val writer = new BufferedWriter(new FileWriter(fileName))
    func(writer)
    writer.close()
  }
}
