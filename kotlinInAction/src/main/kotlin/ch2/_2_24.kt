package ch2

import java.util.*

/*
    맵을 초기화 하고 이터레이션
     - 자바보다 편해진듯
 */

val binaryReps = TreeMap<Char, String>()

fun main(){
    for (c in 'A'..'F'){
        val binary : String = Integer.toBinaryString(c.code)
        binaryReps[c] = binary
    }

    // 맵에 대한 이터레이션
    for((letter, binary) in binaryReps){
        println("${letter}: ${binary}")
    }
}
