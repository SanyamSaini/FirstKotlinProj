fun main() {

    val objChild = Child()
    objChild.myMethod()
    objChild.myMethod2()

}

open class Parent {
    val name: String = ""

    fun myMethod() {
        println("I'm in Parent")
    }
}

class Child : Parent() {
    val name2: String = ""

    fun myMethod2() {
        println("I'm in Child")
    }
}
