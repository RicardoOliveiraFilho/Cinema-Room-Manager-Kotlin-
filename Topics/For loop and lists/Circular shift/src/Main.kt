fun main() {
    val sizeList = readLine()!!.toInt()

    val numbers = mutableListOf<Int>()

    for (i in 0 until sizeList) {
        val number = readLine()!!.toInt()
        numbers.add(number)
    }

    val num = numbers.removeAt(numbers.lastIndex)
    val numbers2 = mutableListOf<Int>()
    numbers2.add(num)
    numbers2.addAll(numbers)

    println(numbers2.joinToString(" "))
}