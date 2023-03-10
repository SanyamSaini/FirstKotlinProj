import kotlin.math.pow

fun main() {
    println(sum(2.0, 3.0))
    println(power(2.0, 3.0))

    val fn = ::sum
    println(fn(2.0, 4.0))

    calculator(5.0, 5.0, ::sum)

    val lambda1 = { x: Double, y: Double -> x + y }
    val multiLineLambda = {
        println("Hello Lambda")
        val a = 2 + 3
        "Hello CheezyCode"
    }
}

fun sum(a: Double, b: Double): Double {
    return a + b
}

fun power(a: Double, b: Double): Double {
    return a.pow(b)
}

fun calculator(a: Double, b: Double, gn: (Double, Double) -> Double) {
    val result = gn(a, b)
    println(result)
}