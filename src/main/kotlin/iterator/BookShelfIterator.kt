package iterator

/**
 * 本棚をスキャンするクラス
 */
class BookShelfIterator(
    private val bookShelf: BookShelf,
): Iterator {
    private var index = 0

    override fun hasNext(): Boolean {
        return index < bookShelf.getLength()
    }

    override fun next(): Book {
        val book = bookShelf.getBookAt(index)
        index++
        return book
    }
}