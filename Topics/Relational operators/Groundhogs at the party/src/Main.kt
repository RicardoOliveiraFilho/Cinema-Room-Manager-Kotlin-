const val MIN_CUPS_NOT_IN_WEEKEND = 10
const val MIN_CUPS_IN_WEEKEND = 15
const val MAX_CUPS_NOT_IN_WEEKEND = 20
const val MAX_CUPS_IN_WEEKEND = 25

fun main() {
    val cupsButterPeanut = readLine()!!.toInt()
    val isWeekend = readLine()!!.toBoolean()

    val result = !isWeekend && cupsButterPeanut in MIN_CUPS_NOT_IN_WEEKEND..MAX_CUPS_NOT_IN_WEEKEND ||
        isWeekend && cupsButterPeanut in MIN_CUPS_IN_WEEKEND..MAX_CUPS_IN_WEEKEND

    println(result)
}