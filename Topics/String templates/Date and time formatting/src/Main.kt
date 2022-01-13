fun main() {
    val (hour, minute, second) = readLine()!!.split(" ")
    val (day, month, year) = readLine()!!.split(" ")

    val text = "$hour:$minute:$second $day/$month/$year"

    println(text)
}