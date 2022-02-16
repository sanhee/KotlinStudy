package ch2


/*
    Enum (열거형)

    java와 다르게 enum class로 생성

    코틀린에서 enum은 소프트 키워드라 변수명으로 사용할 수 있음

    열거 상수와 메서드 구분 기준으로 (;) 을 꼭 붙여줘야 함.
 */

enum class Color(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0), ORANGE(255, 165, 0),
    YELLOW(255, 255, 0), GREEN(0, 255, 0),
    BLUE(0, 0, 255), INDIGO(75, 0, 13),
    VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b
}
