package adapter.practice

fun main() {
    val file: File = FileProperties()

    // ファイルの読み込み
    file.readFromFile("file.txt")
    file.setValue("day", "22")
    file.setValue("month", "2")
    file.setValue("year", "2022")
    file.writeToFile("newFile.txt")
}