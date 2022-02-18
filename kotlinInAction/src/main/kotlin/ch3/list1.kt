package ch3

/*
    val list= listOf(1, 2, 3)

    list.toString() -> [1, 2, 3]
    원하는 것 -> (1; 2; 3)
 */

fun <T> joinToString(collection: Collection<T>, separator: String, prefix: String, postfix: String): String {
    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) {
            result.append(separator)
        }
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun main(){
    val list = listOf(1,2,3)
    println(joinToString(list, ";", "(", ")"))


    // 호출부만 보고서는 각 문자열이 어떤 역할을 하는지 구분할 수 없음
    println(joinToString(list, " ", " ", " "))

    // sol: 이름 붙인 인자
    println(joinToString(list, " ", " ", " "))
}
