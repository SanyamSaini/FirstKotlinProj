fun main() {
    val onePlus = OnePlus()
    onePlus.display()
}

open class Mobile() {
    val name = ""
    val size = 5
    fun makeCall() = println("Calling from mobile")
    fun powerOff() = println("Shutting Down")
    open fun display() = println("Simple Mobile Display")
}

class OnePlus() : Mobile() {
    override fun display() = println("One Plus Display")
}