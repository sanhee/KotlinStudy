package ch3

/*
    3.3.5 확장 프로퍼티

    - 이것 역시, 외부에서 만드는 정적 프로퍼티
    - 따라서, backing field가 없어서 기본 게터 구현을 제공할 수 없음
    - 확장 프로퍼티는 상태를 가질 수 없다.
        - 기존 클래스의 인스턴스 객체에 필드를 추가할 수 없다.
*/

val String.lastChar: Char
    get() = get(length - 1)


// 변경 가능한 확장 프로퍼티
// ex) StringBuilder

var StringBuilder.lastChar: Char
    get() = get(length -1)
    set(value:Char){
        this.setCharAt(length -1, value)
    }

fun main(){
    val sb = StringBuilder("noeul?")
    sb.lastChar = '!'
    println(sb) // noeul!
}
