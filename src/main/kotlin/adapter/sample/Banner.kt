package adapter.sample

class Banner(
    private val value: String
) {
    fun showWithParen() {
        println("(${value})")
    }

    fun showWithAster() {
        println("*${value}*")
    }
}