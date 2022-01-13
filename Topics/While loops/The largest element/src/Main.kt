fun main() {
    var largestNumber = 0

    do {
        val number = readLine()!!.toInt()

        if (number > largestNumber) {
            largestNumber = number
        }
    } while (number != 0)

    println(largestNumber)
}