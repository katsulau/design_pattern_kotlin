package builder.sample

class TextBuilder(
    private val buffer: StringBuffer = StringBuffer()
): Builder() {
    override fun makeTitle(title: String) {
        buffer.append("===============================\n")
        buffer.append("『${title}』\n")
        buffer.append("\n")
    }

    override fun makeString(str: String) {
        buffer.append("■${str}\n")
        buffer.append("\n")
    }

    override fun makeItems(items: List<String>) {
        items.forEach {
            buffer.append(" ・${it}\n")
        }
        buffer.append("\n")
    }

    override fun close() {
        buffer.append("===============================\n")
    }

    fun getResult(): String {
        return buffer.toString()
    }
}