const val FINAL_SPEED = 0

fun calculateBrakingDistance(v1: String, a: String): Int {
    // write your code here
    return try {
        val intV1 = v1.toInt()
        val intA = a.toInt()

        (FINAL_SPEED * FINAL_SPEED - intV1 * intV1) / (2 * intA)
    } catch (error: NumberFormatException) {
        println(error.message)
        -1
    } catch (error: ArithmeticException) {
        println("The car does not slow down!")
        -1
    }
}