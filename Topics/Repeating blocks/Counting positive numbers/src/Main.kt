fun main() {
    val numbersInSequence = readLine()!!.toInt()
    var positiveNumbers = 0

    repeat(numbersInSequence) {
        val number = readLine()!!.toInt()

        if (number > 0) {
            positiveNumbers++
        }
    }

    println(positiveNumbers)
}