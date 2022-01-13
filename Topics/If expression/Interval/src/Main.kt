const val LEFT_INTERVAL_1 = -15
const val RIGHT_INTERVAL_1 = 12
const val LEFT_INTERVAL_2 = 14
const val RIGHT_INTERVAL_2 = 17
const val LEFT_INTERVAL_3 = 19

fun main() {
    val number = readLine()!!.toInt()

    println(
        if (number in LEFT_INTERVAL_1 + 1..RIGHT_INTERVAL_1 ||
            number in LEFT_INTERVAL_2 + 1 until RIGHT_INTERVAL_2 ||
            number >= LEFT_INTERVAL_3
        ) {
            "True"
        } else {
            "False"
        }
    )
}