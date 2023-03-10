fun main() {
    val nums = listOf(1, 2, 3, 4, 5)

    val list = nums.filter(::isOdd)

    val list2 = nums.map { it * it }
    println(list2)

    nums.forEach { println(it) }
}

fun isOdd(a: Int): Boolean {
    return a % 2 != 0
}