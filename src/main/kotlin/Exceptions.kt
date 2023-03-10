import java.lang.IllegalArgumentException

fun main() {
    val arr = arrayOf(1, 2, 3)

    try {
        println(arr[5])
    } catch (e: Exception) {
        println("Please check the array index")
    } finally {
        println("I will execute")
    }
    println("This will not run")

    createUserList(5)
    createUserList(-5)
}

fun createUserList(count: Int) {
    if (count < 0) {
        throw IllegalArgumentException("Count must be greater than 0")
    } else {
        println("User list created containing $count users.")
    }
}