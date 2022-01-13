const val DEZ = 10
const val CEM = 100

fun main() {
    val number = readLine()!!.toInt()

    val digit1 = number / CEM
    val digit2 = number % CEM / DEZ
    val digit3 = number % CEM % DEZ

    println(digit1 + digit2 + digit3)
}