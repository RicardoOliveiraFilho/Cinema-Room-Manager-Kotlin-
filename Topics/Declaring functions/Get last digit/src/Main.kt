const val TEN = 10

fun getLastDigit(num: Int): Int {
    var remains = num % TEN

    if (remains < 0) {
        remains *= -1
    }

    return remains
}

/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}