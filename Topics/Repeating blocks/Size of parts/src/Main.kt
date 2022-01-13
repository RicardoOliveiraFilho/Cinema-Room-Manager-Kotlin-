const val NUMBER_PERFECT_COMPONENTS = 0
const val NUMBER_LARGER_COMPONENTS = 1

fun main() {
    val numberOfParts = readLine()!!.toInt()
    var larger = 0
    var smaller = 0
    var perfect = 0

    repeat(numberOfParts) {
        val detector = readLine()!!.toInt()

        if (detector == NUMBER_PERFECT_COMPONENTS) {
            perfect++
        } else if (detector == NUMBER_LARGER_COMPONENTS) {
            larger++
        } else {
            smaller++
        }
    }

    println("$perfect $larger $smaller")
}