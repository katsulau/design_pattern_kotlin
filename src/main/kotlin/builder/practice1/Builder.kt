package builder.practice1

interface Builder {
    fun makeTitle(title: String)
    fun makeString(str: String)
    fun makeItems(items: List<String>)
    fun close()
}