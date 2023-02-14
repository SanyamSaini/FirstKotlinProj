fun main() {
    val ob = Calculator() //Default Constructor
    println(ob.add(1, 2))

    val p1 = PersonPojo("sanyam", 20)
    println(p1.age)
    println(p1.name)
    p1.age = 22
    p1.age = -12
}

class Calculator {

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun multiply(a: Int, b: Int): Int {
        return a * b
    }
}

class PersonPojo(nameParam: String, ageParam: Int) {

    var name: String = nameParam
        get() {
            return field.toUpperCase()
        }
    var age: Int = ageParam
        set(value) {
            if (value > 0) {
                field = value
            } else println("Age Can't be negative")
        }
}