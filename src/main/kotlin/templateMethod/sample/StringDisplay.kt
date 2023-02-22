package templateMethod.sample

class StringDisplay(
    private val characterString: String
):AbstractDisplay() {
    private val width: Int = characterString.length
    override fun open() {
        printLine()
    }

    override fun print() {
        println("|${characterString}|")
    }

    override fun close() {
        printLine()
    }

    private fun printLine() {
        print("+")
        for (count in 1..width) {
            print("-")
        }
        println("+")
    }
}