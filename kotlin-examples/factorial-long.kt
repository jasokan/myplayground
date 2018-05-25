fun main(args: Array<String>) {

    val number = 15
    var factorialValue: Long = 1
    for (i in 1..number) {
        factorialValue *= i.toLong()
    }
    println("Factorial of $number = $factorialValue")
}