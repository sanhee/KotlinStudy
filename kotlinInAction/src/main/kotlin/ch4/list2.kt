package ch4

/*
    코틀린 인터페이스
    - 자바에서는 extends와 implements 키워드
    - 코틀린은 콜론(:)
    - 코틀린에서는 override 변경자를 꼭 사용해야 한다.
 */

class Button : Clickable {
    override fun click() = println("I was clicked")
}

fun main() {
    println(Button().click())
}
