package ch4


interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int =
    when (e) {
        is Num -> e.value
        is Sum -> eval(e.left) + eval(e.right)
        else -> throw IllegalArgumentException("Unknown exception") // 디폴트 분기는 불편함
    }


/*
    - 상위 클래스에 sealed 변경자를 붙이면 그 상위 클래스를 상속한 하위 클래스 정의를 제한 할 수 있음
    - sealed 클래스의 하위 클래스를 정의할 때는 반드시 상위 클래스 안에 중첩시켜야 함.
    - when 식에서 sealed 클래스의 모든 하위 클래스를 처리한다면 [디폴트 분기]가 필요 없음
    - sealed는 open 생략 가능
 */

sealed class SealedExpr {
    class Num(val value: Int) : SealedExpr()
    class Sum(val left: SealedExpr, val right: SealedExpr) : SealedExpr()
}

fun eval(e: SealedExpr): Int =
    when (e) {
        is SealedExpr.Num -> e.value
        is SealedExpr.Sum -> eval(e.left) + eval(e.right)
    }

fun main(){
    println(eval(
        SealedExpr.Sum(SealedExpr.Sum(SealedExpr.Num(1), SealedExpr.Num(2)), SealedExpr.Num(4))
    ))
}
