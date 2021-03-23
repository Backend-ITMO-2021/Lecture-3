package ru.ifmo.backend_2021.fileutils

import java.io.{BufferedReader, BufferedWriter, FileReader, FileWriter}

import scala.util.Using;

class FileUtils {
  def withFileReader(fileName: String)(function: BufferedReader => String): String = {
    Using(new BufferedReader(new FileReader(fileName))) { reader =>
      function(reader);
    }.get
  }

  def withFileWriter(fileName: String)(function: BufferedWriter => Unit): Unit = {
    Using(new BufferedWriter(new FileWriter(fileName))) { writer =>
      function(writer);
    }
  }
}
