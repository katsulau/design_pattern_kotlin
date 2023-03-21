package mediator

import java.awt.Button

class ColleagueButton(label: String) : Button(label), Colleague  {

    private lateinit var mediator: Mediator
    override fun setMediator(mediator: Mediator) {
        this.mediator = mediator
    }

    override fun setColleagueEnabled(enabled: Boolean) {
        isEnabled = enabled
    }
}