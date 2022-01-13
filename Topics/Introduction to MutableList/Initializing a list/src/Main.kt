const val ZERO = 0
const val UM = 1
const val NOVE = 9
const val NOVENTA_E_NOVE = 99
const val DEZ = 10
const val CEM = 100

fun main() {
    val numbers = MutableList(CEM) { ZERO }

    numbers[ZERO] = UM
    numbers[NOVE] = DEZ
    numbers[NOVENTA_E_NOVE] = CEM

    // do not touch the lines below 
    println(numbers.joinToString())
}