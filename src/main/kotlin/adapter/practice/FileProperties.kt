package adapter.practice

import java.util.*

class FileProperties(
    private val properties: Properties = Properties()
):File {
    override fun readFromFile(fileName: String) {
        val inputStream = java.io.File(fileName).inputStream()
        properties.load(inputStream)
    }

    override fun writeToFile(fileName: String) {
        val outputStream = java.io.File(fileName).outputStream()
        properties.store(outputStream, "written by FileProperties")
    }

    override fun getValue(key: String): String {
        return properties.getProperty(key)
    }

    override fun setValue(key: String, value: String) {
        properties.setProperty(key, value)
    }
}