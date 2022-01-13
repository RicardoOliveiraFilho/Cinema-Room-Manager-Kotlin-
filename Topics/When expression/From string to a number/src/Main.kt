const val THREE = 3
const val FOUR = 4
const val FIVE = 5
const val SIX = 6
const val SEVEN = 7
const val EIGHT = 8
const val NINE = 9

fun main() {
    val numberExtension = readLine()!!

    when (numberExtension) {
        "one" -> println(1)
        "two" -> println(2)
        "three" -> println(THREE)
        "four" -> println(FOUR)
        "five" -> println(FIVE)
        "six" -> println(SIX)
        "seven" -> println(SEVEN)
        "eight" -> println(EIGHT)
        "nine" -> println(NINE)
        else -> println("number extense incorrect")
    }
}