fun main() {
    val nums = listOf(1, 2, 3) //Immutable List
    val nums2 = mutableListOf(1, 2, 3) //Mutable List
    println(nums.indexOf(3))
    println(nums.contains(3))
    println(nums2[1])

    val students = mutableMapOf<Int, String>() //Mutable Map
    students[1] = "Sanyam"
    students[2] = "Dullu"
    students[3] = "Dhondu"

    for ((key, value) in students) {
        println("$key - $value")
    }

    val map = mapOf<Int, String>(1 to "Hello", 2 to "World") //Immutable Map
}