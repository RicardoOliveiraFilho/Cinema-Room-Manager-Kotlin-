const val VINTE = 20

fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    val result = a + b == VINTE || a + c == VINTE || b + c == VINTE

    println(result)
}