fun main() {
    val word = readLine()!!
    var alphabet = "abcdefghijklmnopqrstuvwxyz"

    for (letter in word) {
        val index = alphabet.indexOf(letter)

        if (index != -1) {
            alphabet = alphabet.replace(alphabet[index], ' ')
        }
    }

    val alphaber2 = alphabet.split(" ")

    println(alphaber2.joinToString(""))
}