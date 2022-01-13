fun main() {
    val numbers = readLine()!!.toInt()
    var prevNumber = 0
    var count = 0
    var prevCount = 0

    for (i in 1..numbers) {
        val number = readLine()!!.toInt()

        if (i == 1 || prevNumber <= number) {
            prevNumber = number
            count++
            prevCount = count
        } else {
            prevNumber = number
            count = 1
        }
    }

    println(prevCount)
}