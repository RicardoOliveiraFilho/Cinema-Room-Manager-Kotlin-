const val ZERO = 0

fun main() {
    val number = readLine()!!.toInt()

    println(
        if (number > ZERO) {
            "positive"
        } else if (number < ZERO) {
            "negative"
        } else {
            "zero"
        }
    )
}