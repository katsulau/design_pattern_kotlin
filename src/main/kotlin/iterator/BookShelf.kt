package iterator

/**
 * 本棚を表すクラス
 */
class BookShelf private constructor(
    private val books: Array<Book?>,
) {
    private var last: Int = 0
    companion object {
        fun of(maxSize: Int): BookShelf {
            return BookShelf(arrayOfNulls<Book>(maxSize))
        }
    }

    fun getBookAt(index: Int): Book {
        return books[index] ?: throw IllegalArgumentException("要素が存在しません")
    }

    fun appendBook(book: Book) {
        books[last] = book
        last++
    }

    fun getLength():Int {
        return last
    }

    fun returnBookShelfIterator(): BookShelfIterator {
        return BookShelfIterator(this)
    }
}