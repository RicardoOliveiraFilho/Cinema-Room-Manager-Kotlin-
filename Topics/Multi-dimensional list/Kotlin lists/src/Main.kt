fun main() {    
    var inputList: MutableList<MutableList<String>> = mutableListOf()
    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val strings = readLine()!!.split(' ').toMutableList()
        inputList.add(strings)
    }
    // Do not change lines above
    // Write your code here
    for (i in 0 until inputList.size) {
        if (i == 2) {
            for (j in 0 until inputList[i].size) {
                if (j == inputList[i].size - 1) {
                    println(inputList[i][j])
                } else {
                    print("${inputList[i][j]}, ")
                }
            }
        }
    }
}