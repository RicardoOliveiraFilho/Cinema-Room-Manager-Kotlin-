fun main() {
    val number1 = readLine()!!.toInt()
    val number2 = readLine()!!.toInt()
    val number3 = readLine()!!.toInt()

    val result = number1 in number2..number3 ||
        number1 in number3..number2

    println(result)
}