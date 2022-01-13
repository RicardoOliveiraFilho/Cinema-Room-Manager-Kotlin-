import java.io.IOException
import kotlin.ArithmeticException

const val THREE = 3

fun suspiciousFunction(param: Int) {
    when (param) {
        0 -> throw Exception("Some exceptions?")
        1 -> throw ArithmeticException("Division by zero")
        2 -> throw Exception("An exception occurred here")
        THREE -> throw IOException()
    }
}        

fun handleException(data: Int) {

    try {
        suspiciousFunction(data)
    } catch (error: ArithmeticException) {
        println(error.message)
    } catch (error: IOException) {
        println("The IOException occurred")
    } catch (error: Exception) {
        println(error.message)
    } finally {
        println("Handling completed successfully!")
    }

}