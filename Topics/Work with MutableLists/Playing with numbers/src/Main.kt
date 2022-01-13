fun main() {
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    // do not touch the lines above
    // write your code here
    val numbers2 = MutableList(numbers.size) { 0 }
    val sum = numbers.sum()

    numbers2.clear()
    numbers2.add(sum)
    numbers.removeAt(numbers.size - 2)
    numbers2.addAll(numbers)
    numbers.clear()
    numbers.addAll(numbers2)

    // do not touch the lines below
    println(numbers.joinToString(" "))
}