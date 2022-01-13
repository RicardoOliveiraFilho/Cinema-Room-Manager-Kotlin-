fun main() {
    val number1 = readLine()!!.toInt()
    val number2 = readLine()!!.toInt()
    val number3 = readLine()!!.toInt()
    val number4 = readLine()!!.toInt()
    val number5 = readLine()!!.toInt()

    val range1 = number1..number2
    val range2 = number3..number4

    println(number5 in range1 || number5 in range2)
}