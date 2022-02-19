package ch4

/*
    추상 멤버는 항상 열려 있다.
    추상 멤버 앞에 open 변경자를 명시할 필요 없음
 */
abstract class Animated {
    abstract fun animate()

    // 추상 클래스에 속했더라도 비추상 함수는 기본적으로 final
    open fun stopAnimating(){
        print("stopAnimating")
    }

    // override 불가
    fun animateTwice(){
        print("animateTwice")
    }
}
