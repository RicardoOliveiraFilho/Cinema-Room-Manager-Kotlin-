fun main() {
    val number1 = readLine()!!.toInt()
    val number2 = readLine()!!.toInt()
    val number3 = readLine()!!.toInt()

    val result = number1 > 0 && number2 <= 0 && number3 <= 0 ||
        number2 > 0 && number1 <= 0 && number3 <= 0 ||
        number3 > 0 && number2 <= 0 && number1 <= 0

    println(result)
}