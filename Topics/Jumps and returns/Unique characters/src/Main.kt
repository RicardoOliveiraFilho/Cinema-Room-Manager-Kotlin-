fun main() {
    val word = readLine()!!
    val letters = arrayListOf<Char>()
    val lettersRemoved = arrayListOf<Char>()

    for (letter in word) {
        if (!letters.contains(letter) && !lettersRemoved.contains(letter)) {
            letters.add(letter)
        } else {
            letters.remove(letter)

            if (!lettersRemoved.contains(letter)) {
                lettersRemoved.add(letter)
            }
        }
    }

    println(letters.size)
}