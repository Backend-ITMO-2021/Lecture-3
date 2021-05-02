package ru.ifmo.backend_2021.markup;

import ru.ifmo.backend_2021.fileutils.FileUtils

trait MarkdownElementBasic {
    def toMarkdown(str: StringBuilder): StringBuilder

	def toFile(fileName: String): Unit = {
		val file = new FileUtils()
	file.withFileWriter(fileName){writer => writer.write(toMarkdown(new StringBuilder).toString)}
	}
}