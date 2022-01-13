fun main() {
    val letter1 = readLine()!!.first()
    val letter2 = readLine()!!.first()

    println(letter1.lowercaseChar() == letter2.lowercaseChar())
}