package iterator

fun main() {
    val bookShelf = BookShelf.of(4)

    val book1 = Book("un hombre llamado ove")
    val book2 = Book("porque nos encantan los gatos")
    val book3 = Book("design pattern")
    val book4 = Book("docker nyumon")

    bookShelf.appendBook(book1)
    bookShelf.appendBook(book2)
    bookShelf.appendBook(book3)
    bookShelf.appendBook(book4)
    val bookShelfIterator = bookShelf.returnBookShelfIterator()
    while (bookShelfIterator.hasNext()) {
        val book = bookShelfIterator.next()
        println(book.name)
    }
}