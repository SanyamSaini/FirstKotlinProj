fun main() {
    println("Hi".formattedString())
}

fun String.formattedString(): String {
    return "----------\n$this\n-----------"
}