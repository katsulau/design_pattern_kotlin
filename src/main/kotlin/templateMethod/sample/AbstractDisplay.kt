package templateMethod.sample

abstract class AbstractDisplay {
    protected abstract fun open()

    protected abstract fun print()

    protected abstract fun close()

    fun display() {
        open()
        for (count in 1..5) {
            print()
        }
        close()
    }
}