package ru.ifmo.backend_2021.fileutils

import java.io.{BufferedReader,FileReader, FileWriter, BufferedWriter}

class FileUtils {
	def withFileReader(fileName: String)(func: BufferedReader => String): String={
		val reader: BufferedReader = new BufferedReader(new FileReader(fileName))
		try {
			func(reader)
		} finally reader.close()
	}

	def withFileWriter(fileName: String)(func: BufferedWriter => Unit): Unit={
		val writer: BufferedWriter = new BufferedWriter(new FileWriter(fileName))
		try{
			func(writer)
		} finally writer.close()
	}
}