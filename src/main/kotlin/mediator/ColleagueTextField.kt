package mediator

import java.awt.Color
import java.awt.TextField
import java.awt.event.TextEvent
import java.awt.event.TextListener

class ColleagueTextField(text: String, columns: Int) : TextField(text, columns), TextListener, Colleague {

    private lateinit var mediator: Mediator

    /**
     * textListenerの実装
     * つまり、対象のコンポーネントに変更があったタイミングで、呼び出されるメソッドとなる。
     * どのコンポーネントを活性化、非活性化するかは、複数のコンポーネントの状態によって判断しなければならない。
     * そのため、各コンポーネントでの判断処理を行うのではなく、コンポーネントの状態に変更があったタイミングで、
     * mediator役に相談をする(mediator.colleagueChangedメソッドを呼び出す)、という形になる。
     */
    override fun textValueChanged(e: TextEvent?) {
        mediator.colleagueChanged()
    }

    override fun setMediator(mediator: Mediator) {
        this.mediator = mediator
    }

    override fun setColleagueEnabled(enabled: Boolean) {
        isEnabled = enabled
        background = if (enabled) {
            Color.WHITE
        } else {
            Color.LIGHT_GRAY
        }
    }
}