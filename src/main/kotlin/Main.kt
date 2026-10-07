fun main(){
    println("The larger number is: " + largerOf(15, 9))
}

fun largerOf(a: Int, b: Int): Int {
    val larger: Int
    if (a > b) {
        larger = a
    } else {
        larger = b
    }
    return larger
}