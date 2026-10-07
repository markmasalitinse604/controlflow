fun main(){
    println("The larger number is: " + largerOf(15, 9))
    println(describeNumber(3))
    println(describeNumber(20))
    checkRange(42)
    checkType("Kotlin")
    checkType(3.14)
    println(compareNumberAndText(7, "7"))
    println(identifyPet("Goldfish"))
    println(describeAnything(0))
    println(describeAnything("Hi"))
    println(describeAnything(2.5))
    println(describeAnything(42))
    println(describeAnything("Kotlin"))
    forEachStandard()
    forEachIndices()
    forEachWithIndex()
    whileWithList()
    doWhileCountdown()
}

//if as an expression with blocks: the last line of each branch is the result
//else is mandatory when if is used as an expression
fun largerOf(a: Int, b: Int) =
    if (a > b) {
        print("First number wins. ")
        a
    } else {
        print("Second number wins. ")
        b
    }


//when as an expression: returns a String instead of printing
fun describeNumber(value: Int) = when (value) {
    0 -> "Zero"
    1 -> "One"
    in 2..4 -> "Small number (2-4)"
    10, 20, 30 -> "A round number: 10, 20 or 30"
    else -> "Some other number: " + value
}

fun checkRange(value: Int) {
    when (value) {
        in 1..10 -> println("Between 1 and 10")
        !in 50..100 -> println("Not between 50 and 100")
    }
}

fun checkType(value: Any) {
    when (value) {
        is String -> println("It is a String")
        !is String -> println("It is NOT a String")
    }
}

//a branch condition can be any expression
fun compareNumberAndText(number: Int, text: String) = when (number) {
    text.toInt() -> "The text holds the same number"
    else -> "The text holds a different number"
}

//when without an argument works like an if-else chain
fun identifyPet(name: String) = when {
    name == "Rex" -> "Probably a dog"
    name == "Tom" -> "Probably a cat"
    name.contains("fish") -> "Some kind of fish"
    name.isEmpty() -> "No name given"
    else -> "Unknown pet"
}

//values and types can be mixed; the first matching branch wins
fun describeAnything(obj: Any) = when (obj) {
    0 -> "Zero"
    "Hi" -> "A greeting"
    is Double -> "A Double value"
    !is String -> "Not a String"
    else -> "Some String"
}

fun forEachStandard() {
    val cities = listOf("Dublin", "Cork", "Waterford")
    for (city in cities) {
        println("City: " + city)
    }
}

fun forEachIndices() {
    val cities = listOf("Dublin", "Cork", "Waterford")
    for (index in cities.indices) {
        println("City at " + index + " is " + cities[index])
    }
}

fun forEachWithIndex() {
    val cities = listOf("Dublin", "Cork", "Waterford")
    for ((index, city) in cities.withIndex()) {
        println("" + index + " -> " + city)
    }
}

fun whileWithList() {
    val cities = listOf("Dublin", "Cork", "Waterford")
    var index = 0
    while (index < cities.size) {
        println("While loop, city " + index + ": " + cities[index])
        index++
    }
}

//do-while always runs the body at least once
fun doWhileCountdown() {
    var count = 3
    do {
        println("Countdown: " + count)
        count--
    } while (count > 0)
    println("Lift off!")
}