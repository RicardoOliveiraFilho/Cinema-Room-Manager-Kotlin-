fun main() {
    val amountStudentsClass1: UInt = readLine()!!.toUInt()
    val amountStudentsClass2: UInt = readLine()!!.toUInt()
    val amountStudentsClass3: UInt = readLine()!!.toUInt()

    val amountDesksClass1 = amountStudentsClass1 / 2u + amountStudentsClass1 % 2u
    val amountDesksClass2 = amountStudentsClass2 / 2u + amountStudentsClass2 % 2u
    val amountDesksClass3 = amountStudentsClass3 / 2u + amountStudentsClass3 % 2u

    println(amountDesksClass1 + amountDesksClass2 + amountDesksClass3)
}