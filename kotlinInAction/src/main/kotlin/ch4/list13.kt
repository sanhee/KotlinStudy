package ch4

open class A(val element1: String, val element2: String)

class B(e1: String, e2: String) : A(e1, e2) {
}

class C : A {
    constructor(e: String) : this(e, "default")
    constructor(e: String, e2: String) : super(e, e2)
}
