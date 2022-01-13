fun isVowel(letter: Char): Boolean {
    val letterAux = letter.toString().lowercase()
    return letterAux == "a" || letterAux == "e" || letterAux == "i" ||
        letterAux == "o" || letterAux == "u"
}

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}