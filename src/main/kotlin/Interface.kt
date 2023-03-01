fun main() {
    dragObject(arrayOf(IntCircle(2.0), IntSquare(2.0), IntTriangle(2.0, 2.0), Player("Sachin")))

}

fun dragObject(objects: Array<Draggable>) {
    for (obj in objects) {
        obj.drag()
    }
}

interface Draggable {
    fun drag()
}

abstract class IntShape : Draggable {
    abstract fun area(): Double
}

class IntCircle(val radius: Double) : IntShape() {
    override fun area(): Double = Math.PI * radius * radius
    override fun drag() = println("Circle is Dragging")
}

class IntSquare(val side: Double) : IntShape() {
    override fun area(): Double = side * side
    override fun drag() = println("Square is Dragging")

}

class IntTriangle(val base: Double, val height: Double) : IntShape() {
    override fun area(): Double = 0.5 * base * height
    override fun drag() = println("Triangle is Dragging")

}

class Player(val name: String) : Draggable {
    override fun drag() = println("$name is dragging")
}