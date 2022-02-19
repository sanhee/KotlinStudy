package ch4

/*
    코틀린은 자신보다 가시성이 더 낮은 타입을 참조하지 못하게 함
    자신과 가시성이 같거나 더 높아야함.

    이런 규칙은 어떤 함수를 호출하거나 어떤 클래스를 확장할 때
       -> 필요한 모든 타입에 접근할 수 있게 보장
 */

internal open class TalkativeButton : Focusable{
    private fun yell() = println("Hey!")
    protected fun whisper() = println("Let's talk!")
}

// 오류: public 멤버가 자신의 internal 수신 타입인 TalkativeButton를 노출

/*
fun TalkativeButton.giveSpeech(){
   //yell()
   //whisper()
}
*/
