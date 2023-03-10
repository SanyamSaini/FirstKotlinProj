fun main() {
    val employee = Employee()
    employee.age = 20
    employee.name = "Shankar"

    employee.apply {
        age = 30
        name = "Mahadev"
    }

    employee.let {
        println(it.age)
        println(it.name)
    }

    with(employee) {
        age = 27
        name = "Sanyam"
        println(age)
        println(name)
    }

    employee.run {
        age = 27
        name = "Sanyam"
        println(age)
        println(name)
    }

}

data class Employee(var name: String = "", var age: Int = 18)