fun main() {

    val iContainer = Container(5)
    val sContainer = Container("Sanyam")

    add(1, 2, 3, 4, 7, 9, 6)

}

//Generic - Identifies the data type.
class Container<T>(var data: T) {
    fun setValue(value: T) {
        data = value
    }

    fun getValue(): T {
        return data
    }
}

fun add(vararg values: Int) { //vararg - Variable number of Arguments
    var sum = 0
    for (i in values) {
        sum += i
    }

    println(sum)
}