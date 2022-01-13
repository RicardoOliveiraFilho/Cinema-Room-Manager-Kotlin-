fun main() {
    val number1 = readLine()!!.toInt()
    val number2 = readLine()!!.toInt()

    val text = "$number1 plus $number2 equals ${number1 + number2}"

    println(text)
}