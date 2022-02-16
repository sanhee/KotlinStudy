package ch2


/*
    한 when 분기 안에 여러 값 사용하기
 */

fun getWarmth(color: Color) = when(color){
    Color.YELLOW, Color.ORANGE -> "warm"
    else -> "default"
}
