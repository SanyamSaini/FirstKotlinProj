fun main() {
    val fn = ::addition
    println(fn(1, 2))
}

fun addition(a: Int, b: Int) = a + b