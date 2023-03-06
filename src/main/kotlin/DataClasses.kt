fun main() {
    val p1 = DataPerson(1, "Sam")
    val p2 = DataPerson(1, "Sam")

    val p3 = p1.copy()
    val p4 = p1.copy(id = 3)
    println(p3)
    println(p4)

    val (id, name) = p1
    println(id)
    println(name)

}

data class DataPerson(val id: Int, val name: String)