fun main(){
    println("The larger number is: " + largerOf(15, 9))
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