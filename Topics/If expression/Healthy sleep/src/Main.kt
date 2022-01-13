fun main() {    
    val recommendedHoursSleep = readLine()!!.toInt()
    val maximumHoursSleepAllowed = readLine()!!.toInt()
    val hoursReallySlept = readLine()!!.toInt()

    println(
        if (hoursReallySlept in recommendedHoursSleep..maximumHoursSleepAllowed) {
            "Normal"
        } else if (recommendedHoursSleep > hoursReallySlept) {
            "Deficiency"
        } else {
            "Excess"
        }
    )
}