fun main() {
    val size = readLine()!!.toInt()

    val setList = mutableListOf<Int>()

    for (i in 0 until size) {
        val number = readLine()!!.toInt()
        setList.add(number)
    }

    val number = readLine()!!.toInt()

    if (setList.contains(number)) {
        println("YES")
    } else {
        println("NO")
    }
}