package builder.practice2

class TextBuilder(
    private val buffer: StringBuffer = StringBuffer()
): Builder() {
    override fun buildTitle(title: String) {
        buffer.append("===============================\n")
        buffer.append("『${title}』\n")
        buffer.append("\n")
    }

    override fun buildString(str: String) {
        buffer.append("■${str}\n")
        buffer.append("\n")
    }

    override fun buildItems(items: List<String>) {
        items.forEach {
            buffer.append(" ・${it}\n")
        }
        buffer.append("\n")
    }

    override fun buildClose() {
        buffer.append("===============================\n")
    }

    fun getResult(): String {
        return buffer.toString()
    }
}