fun main() {
    val numbers = readLine()!!.toInt()
    var minimum = 1

    for (i in 1..numbers) {
        val number = readLine()!!.toInt()

        if (i == 1) {
            minimum = number
        } else {
            if (minimum > number) {
                minimum = number
            }
        }
    }

    println(minimum)
}