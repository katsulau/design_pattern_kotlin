package templateMethod.sample

import java.io.InputStream

fun main() {
    val d1: AbstractDisplay = CharDisplay('H')
    val d2: AbstractDisplay = StringDisplay("Hello, World!")
    d1.display()
    d2.display()


}