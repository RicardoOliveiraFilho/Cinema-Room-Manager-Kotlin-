const val LIMIT_GRADE_D = 3
const val LIMIT_GRADE_C = 4
const val LIMIT_GRADE_B = 5

fun main() {
    val n = readLine()!!.toInt()

    var gradeD = 0
    var gradeC = 0
    var gradeB = 0
    var gradeA = 0

    repeat(n) {
        val grade = readLine()!!.toInt()

        if (grade < LIMIT_GRADE_D) {
            gradeD++
        } else if (grade < LIMIT_GRADE_C) {
            gradeC++
        } else if (grade < LIMIT_GRADE_B) {
            gradeB++
        } else {
            gradeA++
        }
    }

    println("$gradeD $gradeC $gradeB $gradeA")
}