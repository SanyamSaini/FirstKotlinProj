fun main() {
    println(A.num)
    B.test()

    var test = object {
        val x = 10
        fun method() = println("I'm an object expression")
    }

    var obj = object : Cloneable {
        override fun clone() {
            
        }

    }

}

interface Cloneable {
    fun clone()
}

object A {
    val num = 0
}

object B {
    fun test() {
        println("I'm object B")
    }
}