const val NUMBER = 42

fun main() {
    val answer: Int = try {
        readLine()!!.toInt()
    } catch (error: NumberFormatException) {
        NUMBER
    } finally {
        println("The answer is a number")
    }
    println(answer)
}