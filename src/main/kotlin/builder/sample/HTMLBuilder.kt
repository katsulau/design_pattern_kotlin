package builder.sample

import java.io.FileWriter
import java.io.IOException
import java.io.PrintWriter

class HTMLBuilder: Builder() {
    private lateinit var fileName: String
    private lateinit var printWriter: PrintWriter
    override fun makeTitle(title: String) {
        fileName = "${title}.html"
        try {
            printWriter = PrintWriter(FileWriter(fileName))
        } catch (e: IOException) {
            e.printStackTrace()
        }
        printWriter.println("<html><head><title>${title}</title></head><body>")
        printWriter.println("<h1>${title}</h1>")
    }

    override fun makeString(str: String) {
        printWriter.println("<p>${str}</p>")
    }

    override fun makeItems(items: List<String>) {
        printWriter.println("<ul>")
        items.forEach { printWriter.println("<li>${it}</li>") }
        printWriter.println("</ul>")
    }

    override fun close() {
        printWriter.println("</body></html>")
        printWriter.close()
    }

    fun getResult():String {
        return fileName
    }
}