package ru.ifmo.backend_2021.fileutils

import java.io.{BufferedReader, BufferedWriter, File, FileReader, PrintWriter}

class FileUtils {
  def withFileReader(name: String)(func: BufferedReader => String): String = {
    val fr = new BufferedReader(new FileReader(name))
    try {
      func(fr)
    }finally{
    fr.close()
    }
  }

  def withFileWriter(name: String)(func: BufferedWriter => Unit) = {
    val fw = new BufferedWriter(new PrintWriter(new File(name)))
    try {
      func(fw)
    }finally{
      fw.close()
    }
  }
}
