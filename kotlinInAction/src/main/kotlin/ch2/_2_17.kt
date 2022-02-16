package ch2

/*
    is = instanceOf + 캐스팅 :: 스마트 캐스팅
     - 타입 변환을 따로 안해줘 도 됨.
 */

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int {
    if (e is Num) {
        return e.value
    }
    if (e is Sum) {
        return eval(e.left) + eval(e.right)
    }
    throw IllegalArgumentException("Unknown expression")
}

fun main(){
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
}
