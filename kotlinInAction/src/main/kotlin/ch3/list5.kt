package ch3

/*
    3.5 멤버 함수 오버라이드
*/

open class View {
    open fun click() = println("View clicked")
}

open class Button : View() {
    override fun click() {
        println("Button clicked")
    }
}

fun main() {
    val view: View = Button()
    view.click() // Button clicked
}
