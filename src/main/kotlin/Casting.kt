fun main() {
    val circle = CastCircle(4.0)
    val player = CastPlayer("Sam")

    if (circle is CastCircle) {
        
    }
}

interface CastDraggable {
    fun drag()
}

abstract class CastShape : CastDraggable {
    abstract fun area(): Double
}

class CastCircle(val radius: Double) : CastShape() {
    override fun area(): Double = Math.PI * radius * radius
    override fun drag() = println("Circle is Dragging")
}

class CastPlayer(val name: String) : Draggable {
    override fun drag() = println("$name is dragging")
    fun sayMyName() = println("Hey my name is - $name")
}