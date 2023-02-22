package builder.sample

fun main(args: Array<String>) {
    if (args[0].equals("plain")) {
        val builder = TextBuilder()
        val director = Director(builder)
        director.construct()
        println(builder.getResult())
    } else if (args[0].equals("html")) {
        val builder = HTMLBuilder()
        val director = Director(builder)
        director.construct()
        println("${builder.getResult()}が作成されました")
    }
}