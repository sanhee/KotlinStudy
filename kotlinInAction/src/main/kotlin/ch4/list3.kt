package ch4

/*
    인터페이스 안에 본문이 있는 메소드 정의
 */

interface Clickable2{
    fun click() // 일반 메소드
    fun showOff() = println("I'm clickable") // 디폴트 구현이 있는 메소드
}

// 동일한 메소드를 구현하는 다른 인터페이스 정의
interface Focusable{
    fun setFocus(b: Boolean){
        println("I ${if (b) "got" else "lost"} focus.")
    }
    fun showOff() = println("I'm focusable!")
}

// 상속한 이터페이스의 메소드 구현 호출

class Button2 : Clickable2, Focusable{
    override fun click() {
        println("I was clicked")
    }

    override fun showOff() {
        super<Clickable2>.showOff()
        super<Focusable>.showOff()
    }
}

fun main(){
    val button = Button2()
    button.setFocus(true)
    button.setFocus(false)
    button.showOff()
    button.click()
}
