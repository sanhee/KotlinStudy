package ch4.compare.implement_kotlin_interface_in_java

class KotlinImpl : KotlinInterface {
    override fun abstractMethod() {
        println("추상메서드만 구현하면 된다!")
    }
}
