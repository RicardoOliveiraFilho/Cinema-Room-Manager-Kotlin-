fun divide(num1: Long, num2: Long) = num1.toDouble() / num2.toDouble()

/* Do not change code below */
fun main() {
    val a = readLine()!!.toLong()
    val b = readLine()!!.toLong()
    println(divide(a, b))
}