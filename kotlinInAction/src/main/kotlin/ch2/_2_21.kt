package ch2

import java.lang.IllegalArgumentException

/*
    분기에 복잡한 동작이 들어가 있는 when 사용
     - 리턴은 람 다식 맨 마지막에 위치
*/

fun evalWithLogging(e: Expr): Int = when(e){
    is Num -> {
        println("num: ${e.value}")
        e.value
    }
    is Sum -> {
        val left = evalWithLogging(e.left)
        val right = evalWithLogging(e.right)
        println("sum: ${left} + ${right}")

        left + right
    }
    else -> throw IllegalArgumentException("언노운 익스프레션")
}
