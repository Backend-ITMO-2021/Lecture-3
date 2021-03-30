package ru.ifmo.backend_2021.fileutils
import java.io._

class FileUtils {

  def withFileReader(fileName: String)(function: BufferedReader => String): String = {
    val fileReader = new FileReader(fileName)
    val bufferedReader = new BufferedReader(fileReader)
    try  {
      function(bufferedReader)
    } finally {
      bufferedReader.close()
      fileReader.close()
    }
  }

  def withFileWriter(fileName: String)(function: BufferedWriter => Unit): Unit = {
    val fileWriter = new FileWriter(fileName)
    val bufferedWriter = new BufferedWriter(fileWriter)
    try {
      function(bufferedWriter)
    } finally {
      bufferedWriter.close()
      fileWriter.close()
    }
  }
}
