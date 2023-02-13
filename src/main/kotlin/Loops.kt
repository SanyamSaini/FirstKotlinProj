fun main() {
    var count = 5

    do {
        println("Running just once")
    } while (count > 5)

    while (count >= 1) {
        println("Hello")
        count--
    }

    val number = 2
    for (i in 1..10) {
        //String Templating
        println("$number x $i = ${number * i}")
    }


}