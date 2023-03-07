fun main() {

    val day = Day.SUNDAY
    println(day)
    println(day.number)
    day.printFormattedDay()

    val tile = Red("Mushroom", 25)
    val tile2 = Red("Fire", 30)

    println("${tile.points} . ${tile.type}")

}

enum class Day(val number: Int) {
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

    fun printFormattedDay() {
        println("Day is $this")
    }
}

sealed class Tile
class Red(val type: String, val points: Int) : Tile()
class Blue(val points: Int) : Tile()