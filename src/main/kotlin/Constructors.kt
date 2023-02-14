fun main() {
    val car = Automobile("Car", 4, 5, "Petrol")
    val car2 = Automobile("Car", "Petrol")
    val person = Person()

}

//Primary Constructor
class Automobile(val name: String, val tyres: Int, val maxSeating: Int, val engineType: String) {

    init {
        println("Initializer called")
    }

    //Secondary Constructor
    constructor(nameParam: String, engineParam: String) : this(nameParam, 4, 5, engineParam)

    fun drive() {}
    fun applyBrakes() {}

    init {
        println("2nd Initializer called")
    }
}

class Person() {
    val name = ""
    val age = 0
}