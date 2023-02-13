fun main() {
    val number = 5
//    val result = number in 1..5 //1,2,3,4,5
    val result = number in 1 until 5 //1,2,3,4

    println(result)


    val animal = "Dog"
    when(animal) {
        "Horse" -> println("Animal is Horse")
        "Cat" -> println("Animal is Cat")
        "Dog" -> println("Animal is Dog")
        else -> println("Animal is not found")
    }
}