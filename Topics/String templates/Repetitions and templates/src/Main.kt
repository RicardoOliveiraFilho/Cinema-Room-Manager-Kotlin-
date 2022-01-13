fun main() {
    val word = readLine()!!
    val wordLength = word.length
    val textBase = "$wordLength repetitions of the word $word: "

    println(textBase + word.repeat(wordLength))
}