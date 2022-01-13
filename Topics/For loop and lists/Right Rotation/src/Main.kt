fun main() {
    val sizeList = readLine()!!.toInt()
    val list = mutableListOf<Int>()

    for (i in 0 until sizeList) {
        val number = readLine()!!.toInt()
        list.add(number)
    }

    val rotation = readLine()!!.toInt()
    val list2 = mutableListOf<Int>()

    if (rotation > list.size && rotation % list.size != 0) {
        val remains = rotation % list.size

        for (i in 1..remains) {
            list2.add(list[list.size - 1])
            list.remove(list[list.size - 1])
        }

        list2.sort()

        list2.addAll(list)
        println(list2.joinToString(" "))
    } else {
        if (rotation <= list.size) {
            for (i in 1..rotation) {
                list2.add(list[list.size - 1])
                list.remove(list[list.size - 1])
            }

            list2.sort()

            list2.addAll(list)
            println(list2.joinToString(" "))
        } else {
            println(list.joinToString(" "))
        }
    }
}