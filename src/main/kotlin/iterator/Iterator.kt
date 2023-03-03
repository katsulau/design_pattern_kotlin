package iterator

/**
 * 数え上げ、スキャンを行うインターフェイス
 */
interface Iterator {

    fun hasNext(): Boolean

    fun next(): Any
}