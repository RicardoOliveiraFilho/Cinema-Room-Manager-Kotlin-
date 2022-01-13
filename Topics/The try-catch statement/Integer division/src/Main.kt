import kotlin.ArithmeticException
import kotlin.NumberFormatException

fun intDivision(x: String, y: String): Int {
    return try {
        val numX = x.toInt()
        val numY = y.toInt()

        numX / numY
    } catch (error: NumberFormatException) {
        val err = NumberFormatException("Read values are not integers.")
        println("${err.message}")
        0
    } catch (error: ArithmeticException) {
        val err = ArithmeticException("Exception: division by zero!")
        println("${err.message}")
        0
    }
}

fun main() {
    val x = readLine()!!
    val y = readLine()!!
    println(intDivision(x, y))
}