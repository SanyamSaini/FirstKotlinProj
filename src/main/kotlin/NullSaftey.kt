fun main() {
    var gender: String? = null //Nullable Type
    var gender1: String = "Male" //Non - Nullable Type

    gender?.toUpperCase() //Safe Call

    val selectedValue = gender ?: "N/A" //Elvis Operator

    gender!!.toUpperCase() //Not Null Asserted Operator
}


