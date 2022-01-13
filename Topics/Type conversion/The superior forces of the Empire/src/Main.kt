import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val infoNavesImperio = scanner.next()
    val infoNavesResistencia = scanner.next()

    val qtdNavesImperio = infoNavesImperio.toInt()
    val qtdNavesResistencia = infoNavesResistencia.toInt()

    val soberaniaImperio = qtdNavesImperio / qtdNavesResistencia

    println(soberaniaImperio)
}