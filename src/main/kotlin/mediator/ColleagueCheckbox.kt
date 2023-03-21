package mediator

import java.awt.Checkbox
import java.awt.CheckboxGroup
import java.awt.event.ItemEvent
import java.awt.event.ItemListener

/**
 * チェックボックスのコンポーネント
 */
class ColleagueCheckbox(
    label: String, group: CheckboxGroup, state: Boolean
) : Checkbox(label, group, state), ItemListener, Colleague {

    // mediatorを持つ目的は、
    private lateinit var mediator: Mediator

    /**
     * eventListenerの実装
     * つまり、対象のコンポーネントに変更があったタイミングで、呼び出されるメソッドとなる。
     * どのコンポーネントを活性化、非活性化するかは、複数のコンポーネントの状態によって判断しなければならない。
     * そのため、各コンポーネントでの判断処理を行うのではなく、コンポーネントの状態に変更があったタイミングで、
     * mediator役に相談をする(mediator.colleagueChangedメソッドを呼び出す)、という形になる。
     */
    override fun itemStateChanged(e: ItemEvent?) {
        mediator.colleagueChanged()
    }

    override fun setMediator(mediator: Mediator) {
        this.mediator = mediator
    }

    /**
     * 活性化・非活性化をする
     */
    override fun setColleagueEnabled(enabled: Boolean) {
        isEnabled = enabled
    }
}