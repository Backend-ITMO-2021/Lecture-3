package ru.ifmo.backend_2021.fileutils
import java.io.{BufferedReader, BufferedWriter, FileReader, FileWriter} 

class FileUtils {
  
    def withFileReader(file: String)(reader: BufferedReader => String): String = {
        val fileReader = new BufferedReader(new FileReader(file));
        var finStr = ""
        if (fileReader.ready()) { finStr = reader(fileReader)}
        fileReader.close()
        finStr
    }

    def withFileWriter(file: String)(writer: BufferedWriter => Unit): Unit = {
        val fileWriter = new BufferedWriter(new FileWriter(file));
        writer(fileWriter)
        fileWriter.close()
    }
}
