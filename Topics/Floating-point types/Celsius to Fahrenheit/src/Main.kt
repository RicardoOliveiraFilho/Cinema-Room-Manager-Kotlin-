const val MULTIPLICADOR = 1.8
const val SOMADOR = 32

fun main() {
    val celsiusTemp = readLine()!!.toDouble()

    println(celsiusTemp * MULTIPLICADOR + SOMADOR)
}