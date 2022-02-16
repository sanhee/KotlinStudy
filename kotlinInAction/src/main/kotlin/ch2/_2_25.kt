package ch2

/*
    in으로 컬렉션이나 범위의 원소 검사
 */

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNoDigit(c: Char) = c !in '0'..'9'

fun recognize1(c:Char) = when(c) {
    in '0'.. '9' -> "It's a digit"
    in 'a'.. 'z',  in 'A'.. 'Z' -> "It's a letter"
    else -> "I don't know.."
}

fun recognize(c:Char) = when {
    isNoDigit(c) -> "문자입니다."
    else -> "숫자임"
}

fun main(){
    println(recognize('1'))
}
