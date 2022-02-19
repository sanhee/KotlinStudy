package ch4

import ch3.View
import java.io.Serializable


/*
    4.1.4 내부 클래스와 중첩된 클래스

    - 코틀린의 중첩 클래스(nestaed class)는 명시적으로 요청하지 않는 한
    - 바깥쪽 클래스 인스턴스에 대한 접근 권한이 없다.

*/

interface State: Serializable

interface View{
    fun getCurrentState() : State
    fun restoreState(state: State)
}

fun main(){
    println()
}
