package ch4

import java.io.ByteArrayOutputStream
import java.io.ObjectOutputStream
import java.util.*

/*
    코틀린 중첩 클래스(nested class) == 자바 static class
    코틀린 inner nested class == 자바 innder class
 */

class Button3 : View{
    override fun getCurrentState(): State = ButtonState()

    override fun restoreState(state: State){
        /* .... */
    }

    // nested class  -> 자바의 inner class와 다르다.
    class ButtonState : State
}

fun main() {
    val button = Button3()
    val serializeState: ByteArray

    val out = ByteArrayOutputStream()
    val objectOutputStream = ObjectOutputStream(out)

    objectOutputStream.writeObject(button.getCurrentState())
    serializeState = out.toByteArray()

    println("직렬화 결과: $serializeState")
    println("직렬화 결과(인코딩): " + Base64.getEncoder().encodeToString(serializeState))
}
