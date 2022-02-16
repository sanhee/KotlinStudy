package ch2

/*
    switch 보다 많은 기능을 제공하는 when 예제
 */

fun getMnemonic(color: Color) = when (color) {
    Color.RED -> "Richard"
    Color.ORANGE -> "Of"
    Color.YELLOW -> "York"
    else -> "default"
}

fun main() {
    println(getMnemonic(Color.YELLOW))
}
