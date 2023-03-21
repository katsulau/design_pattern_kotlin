package mediator

interface Mediator {

    /**
     * Mediatorが管理するメンバーを生成するメソッド
     */
    fun createColleagues()

    /**
     * 各メンバーであるColleagueから呼び出されるメソッド
     * 相談役への「相談」に当たる
     */
    fun colleagueChanged()
}