fun main() {
    val above70 = false
    val knowsPrograming = true

    //&&
    var calledForInterview = above70 && knowsPrograming
    println(calledForInterview)

    // ||
    calledForInterview = above70 || knowsPrograming
    println(calledForInterview)
    println(!calledForInterview)
}