package builder.practice2

abstract class Builder {

    private var initialized: Boolean = false

    fun makeTitle(title: String) {
        if (!initialized) {
            buildTitle(title)
            initialized = true
        }
    }
    fun makeString(str: String) {
        if (initialized) {
            buildString(str)
        }
    }
    fun makeItems(items: List<String>) {
        if (initialized) {
            buildItems(items)
        }
    }
    fun close() {
        if (initialized) {
            buildClose()
        }
    }
    abstract fun buildTitle(title: String)
    abstract fun buildString(str: String)
    abstract fun buildItems(items: List<String>)
    abstract fun buildClose()

}