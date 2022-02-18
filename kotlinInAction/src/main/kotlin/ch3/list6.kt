package ch3

/*
    확장 함수는 오버라이드 할 수 없다.
     - 확장 함수는 클래스의 일부가 아님, 클래스 밖에어 선언됨.
     - 확장 함수를 호출할 떄 수신 객체로 지정한 변수의 정적 타입에 의해 어떤 확장 함수가 호출될지 결정됨
        - 변수에 지정된 객체의 동적인 타입에 의해 결정되진 않음
 */

fun View.showOff() = println("I'm a view!")
fun Button.showOff() = println("I'm a button!")

fun main() {
    val view: View = Button()
    view.showOff() // I'm a view!
}
