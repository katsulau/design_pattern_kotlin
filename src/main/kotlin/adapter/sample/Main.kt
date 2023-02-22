package adapter.sample

fun main() {
    val banner = Banner("Hello")
    val printBanner: Print = PrintBanner(banner)

    printBanner.printWeak()
    printBanner.printStrong()
}