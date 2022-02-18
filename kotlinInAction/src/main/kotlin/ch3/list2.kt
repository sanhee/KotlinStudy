package ch3

/*
    디폴트 파라미터 값

    - 자바에서는 오버로딩한 메소드가 너무 많아진다는 문제점이 있었음
      - ex) Thread 생성자
    - 코틀린에서는 함수 선언에서 파라미터의 디폴트 값을 지정할 수 있으므로 위와 같은 오버로드를 상당수 피할 수 있음.
    - 자바에서는 디폴트 파라미터 개념이 없어서 코틀린 함수를 자바에서 호출하는 경우, 모든 인자를 명시해야 한다.
       - 좀 더 편하게 코틀린 함수를 호출 하고 싶다면 @JvmOverloads를 함수에 추가하면 자동으로 오버로드 함수를 생성해줌.
 */

fun <T> joinToString2(
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
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
