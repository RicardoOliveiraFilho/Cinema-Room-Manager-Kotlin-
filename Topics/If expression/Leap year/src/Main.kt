const val ZERO = 0
const val QUATRO = 4
const val CEM = 100
const val QUATROCENTOS = 400

fun main() {
    val year = readLine()!!.toInt()

    println(
        if (year % QUATRO == ZERO && (year % CEM != ZERO || year % QUATROCENTOS == ZERO)) {
            "Leap"
        } else {
            "Regular"
        }
    )
}