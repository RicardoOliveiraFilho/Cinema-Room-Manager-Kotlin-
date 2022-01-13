fun main() {
    val character = readLine()!!.first()

    println(character.isUpperCase() || character.isDigit() && character != '0')
}