package templateMethod.sample

class CharDisplay(
    private val char: Char
):AbstractDisplay() {
    override fun open() {
        print("<<")
    }

    override fun print() {
        print(char)
    }

    override fun close() {
        println(">>")
    }
}