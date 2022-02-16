package ch2

import ch2.Color.*

/*
    인자가 없는 when
      - 조건: 각 분기의 조건이 불리언 결과를 계산하는 식이어야 함

    가독성은 조금 떨어지지만
    객체를 매번 생성하는 2.15보다
    성능 향상을 시키기 위한 방법
 */

fun mixOptimized(c1: Color, c2: Color) = when{
    (c1 == RED && c2 == YELLOW) || (c1 == YELLOW && c2 == RED) -> ORANGE
    else -> throw Exception("Dirty color")
}
