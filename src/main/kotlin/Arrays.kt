fun main() {
    val arr = arrayOf(5, 6, 7) //Implicit
    val arr1 = arrayOf<Int>(1, 2, 3) //Explicit

    for ((i, e) in arr.withIndex()) {
        println("$i -> $e")
    }
}