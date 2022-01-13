const val FOUR = 4

fun main() {
    val numberOfElements = readLine()!!.toInt()
    var elementDivisible = 0

    repeat(numberOfElements) {
        val element = readLine()!!.toInt()

        if (element % FOUR == 0 && element > elementDivisible) {
            elementDivisible = element
        }
    }

    println(elementDivisible)
}