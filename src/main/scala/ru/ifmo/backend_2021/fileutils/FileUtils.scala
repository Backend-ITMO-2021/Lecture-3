package ru.ifmo.backend_2021.fileutils
import java.io.{BufferedReader, BufferedWriter, FileReader, FileWriter} 

class FileUtils {
  
    def withFileReader(file: String)(reader: BufferedReader => String): String = {
        val fileReader = new BufferedReader(new FileReader(file));
        val finStr = new StringBuilder()
        if (fileReader.ready()) { finStr.append(reader(fileReader))}
        fileReader.close()
        finStr.toString()
    }

    def withFileWriter(file: String)(writer: BufferedWriter => Unit): Unit = {
        val fileWriter = new BufferedWriter(new FileWriter(file));
        writer(fileWriter)
        fileWriter.close()
    }
}
