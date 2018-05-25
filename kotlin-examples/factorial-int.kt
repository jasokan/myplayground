fun main(args: Array<String>) {

    val number = 5
    var factorialValue: Int = 1
    for (i in 1..number) {
        factorialValue *= i.toInt()
    }
    println("Factorial of $number = $factorialValue")
}