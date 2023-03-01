fun main() {


}

abstract class AllShapes {
    var name: String = ""
    abstract fun area(): Double
    abstract fun display()
}

class CircleShape(val radius: Double) : AllShapes() {
    override fun area(): Double = Math.PI * radius * radius
    override fun display() {
        println("Circle is getting displayed")
    }
}