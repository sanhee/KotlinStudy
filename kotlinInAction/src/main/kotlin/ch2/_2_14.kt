package ch2

import ch2.Color
import ch2.Color.*

/*
    enum 상수 값을 임포트해서 enum 클래스 수식자 없이 enum 사용하기
 */

fun getWarmth1(color: Color) = when(color){
    RED, ORANGE -> "warn"
    else -> "cold"
}
