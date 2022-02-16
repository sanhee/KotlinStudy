package ch2

/*
    반복문 예제
    - 자바 enhanced for loop랑 비슷한 데 영문으로 작성할 수 있어서 가독성이 좋아진 듯
    - 키워드: in, downTo, step .. 등
 */

fun fizzBuzz(i: Int) = when{
    i % 15 == 0 -> "FizzBuzz"
    i % 3 == 0 -> "Fizz"
    i % 5 == 0 -> "Buzz"
    else -> "${i}"
}

fun main(){
    for(i in 1..100 step 2){
        println(fizzBuzz(i))
    }

    for(i in 100 downTo 1 step 2){
        println(fizzBuzz(i))
    }

    // c <= 'A' &&  c<= 'F'
    for(c in 'A'..'F'){
        println(c)
    }
}
