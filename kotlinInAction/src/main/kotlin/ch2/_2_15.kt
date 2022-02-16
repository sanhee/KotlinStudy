package ch2

/*
  when의 분기 조건에 여러 다른 객체 사용하기
   - when은 객체를 동등성 비교를 함
*/

fun mix(c1: Color, c2: Color) = when(setOf(c1, c2)){
    setOf(Color.RED,Color.YELLOW) -> Color.ORANGE
    else -> throw Exception("Dirty color")
}

fun main(){
    println(mix(Color.RED, Color.YELLOW)) // ORANGE
    println(mix(Color.BLUE, Color.YELLOW)) // Exception: Dirty color
}
