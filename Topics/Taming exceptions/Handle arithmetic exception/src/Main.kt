fun divide(num1: Int, num2: Int): String {
    if (num2 == 0) {
        return "Division by zero, please fix the second argument!"
    }

    return (num1 / num2).toString()
}

fun main() {
    val num1 = readLine()!!.toInt()
    val num2 = readLine()!!.toInt()

    println(divide(num1, num2))
}