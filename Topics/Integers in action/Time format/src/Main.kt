const val MIL = 1000
const val HOURS_ON_DAY = 24
const val GMT_3 = 3
const val HOURS = 60 * 60
const val SIXTY = 60

fun main() {
    val totalSeconds = System.currentTimeMillis() / MIL // dont change this line

    val amountHours = totalSeconds / HOURS % HOURS_ON_DAY - GMT_3
    val amountMinutes = totalSeconds % HOURS / SIXTY
    val amountSeconds = totalSeconds % HOURS % SIXTY

    println("$amountHours:$amountMinutes:$amountSeconds")
}