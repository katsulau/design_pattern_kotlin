package mediator

import java.awt.CheckboxGroup
import java.awt.Color
import java.awt.Frame
import java.awt.GridLayout
import java.awt.Label
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import kotlin.system.exitProcess

class LoginFrame(title: String?) : Frame(title), ActionListener, Mediator {
    private lateinit var checkGuest: ColleagueCheckbox
    private lateinit var checkLogin: ColleagueCheckbox
    private lateinit var textUser: ColleagueTextField
    private lateinit var textPass: ColleagueTextField
    private lateinit var buttonOk: ColleagueButton
    private lateinit var buttonCancel: ColleagueButton

    init {
        background = Color.LIGHT_GRAY
        layout = GridLayout(4, 2)
        createColleagues()
        add(checkGuest)
        add(checkLogin)
        add(Label("username:"))
        add(textUser)
        add(Label("password:"))
        add(textPass)
        add(buttonOk)
        add(buttonCancel)
        // 有効/無効の初期設定
        colleagueChanged()
        pack()
        show()
    }

    /**
     * ActionListenerインターフェイスの実装
     * actionListenerとして実装したコンポーネントに、何か変更があったタイミングで、actionPerfoemedメソッドが呼ばれる。
     * LoginFrameをActionListenerとして実装し、okボタン、キャンセルボタンのActionListenerとして登録しておく。
     * そうすることで、okボタン、キャンセルボタンが押された時に、こちらのactionPerformedメソッドが呼び出される形となる。
     */
    override fun actionPerformed(e: ActionEvent?) {
        println(e.toString())
        exitProcess(0)
    }

    override fun createColleagues() {
        val checkboxGroup = CheckboxGroup()
        checkGuest = ColleagueCheckbox("Guest", checkboxGroup, true)
        checkLogin = ColleagueCheckbox("Login", checkboxGroup, false)
        textUser = ColleagueTextField("", 10)
        textPass = ColleagueTextField("", 10)
        textPass.echoChar = '*'
        buttonOk = ColleagueButton("OK")
        buttonCancel = ColleagueButton("Cancel")

        // mediatorのセット
        checkGuest.setMediator(this)
        checkLogin.setMediator(this)
        textUser.setMediator(this)
        textPass.setMediator(this)
        buttonOk.setMediator(this)
        buttonCancel.setMediator(this)

        // Listenerのセット
        checkGuest.addItemListener(checkGuest)
        checkLogin.addItemListener(checkLogin)
        textUser.addTextListener(textUser)
        textPass.addTextListener(textPass)
        buttonOk.addActionListener(this)
        buttonCancel.addActionListener(this)
    }


    override fun colleagueChanged() {
        // ゲストの場合
        if (checkGuest.state) {
            // user、password入力は非活性、okボタンは活性
            textUser.setColleagueEnabled(false)
            textPass.setColleagueEnabled(false)
            buttonOk.setColleagueEnabled(true)
        } else {
            // ログインユーザーの場合、user入力を活性化
            textUser.setColleagueEnabled(true)
            userpassChanged()
        }
    }

    private fun userpassChanged() {

        // userに文字が入ってない場合、パスワードとokボタンが非活性
        if (textUser.text.length  == 0) {
            textPass.setColleagueEnabled(false)
            buttonOk.setColleagueEnabled(false)
            return
        }

        // textUserに1文字以上存在する場合
        textPass.setColleagueEnabled(true)
        // okボタンが活性化
        if (textPass.text.length > 0) {
            buttonOk.setColleagueEnabled(true)
        } else {
            buttonOk.setColleagueEnabled(false)
        }
    }
}