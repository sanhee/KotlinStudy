package ch3

/*
    3.3 메소드를 다른 클래스에 추가: 확장 함수와 확장 프로퍼티
    - 확장 함수
     : 어떤 클래스의 멤버 메소드인 것처럼 호출할 수 있지만, 그 클래스의 밖에 선언된 함수

     fun String.lastChar(): Char = this.get(this.length - 1)
     >> println("ABCD".lastChar()) // D
*/


fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {  // "this"는 수신 객체를 가리킴, 여기서는 T 타입의 원소로 이루어진 컬렉션
        if (index > 0) {
            result.append(separator)
        }
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun main(){
    val list = listOf(1,2,3)
    println(list.joinToString()) // 1, 2, 3
    println(list.joinToString(separator = "|", prefix = "<", postfix = ">")) // <1|2|3>
}
