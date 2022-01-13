fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()

    var count = 0

    for (i in a..b) {
        count += i
    }

    println(count)
}