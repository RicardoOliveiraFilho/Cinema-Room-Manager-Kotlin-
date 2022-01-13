fun main() {
    val char1 = readLine()!!.first()
    val char2 = readLine()!!.first()
    val char3 = readLine()!!.first()

    println(char2 - char1 == char3 - char2 && char2 - char1 == 1)
}