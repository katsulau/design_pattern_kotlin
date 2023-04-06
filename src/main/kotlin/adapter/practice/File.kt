package adapter.practice

interface File {
    fun readFromFile(fileName: String)

    fun writeToFile(fileName: String)

    fun getValue(key: String): String
    fun setValue(key: String, value: String)



}