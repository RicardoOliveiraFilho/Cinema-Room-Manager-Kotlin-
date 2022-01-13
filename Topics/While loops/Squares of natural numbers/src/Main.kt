fun main() {
    val number = readLine()!!.toInt()
    var square = 1

    while (square * square <= number) {
        println(square * square)
        square++
    }
}