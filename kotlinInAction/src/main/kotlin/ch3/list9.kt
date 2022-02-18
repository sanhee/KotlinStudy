package ch3

/*
    String 확장 함수를 사용해 경로 파싱
 */

fun String.parsePath(): Map<String, String>{
    val directory = substringBeforeLast("/")
    val fullName = substringAfterLast("/")
    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")

    return mapOf("directory" to directory, "fullName" to fullName, "fileName" to fileName, "extension" to extension)
}

fun main() {
    val path = "/Users/yole/kotlin-book/chapter.adoc";
    val parse = path.parsePath()

    println(parse["directory"])
    println(parse["fullName"])
    println(parse["fileName"])
    println(parse["extension"])
}
