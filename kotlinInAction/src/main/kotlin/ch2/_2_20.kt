package ch2

/*
    if 중첩 대신 when 사용하기
 */

fun eval2(e: Expr): Int = when (e) {
    is Num -> e.value
    is Sum -> eval2(e.left) + eval(e.right)
    else -> throw IllegalArgumentException("Unknown expression")
}

fun main() {
    println(eval2(Sum(Sum(Num(1), Num(2)), Num(4))))
}
