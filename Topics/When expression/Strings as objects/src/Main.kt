fun main() {
    val input = readLine()!!
    var firstSymbol = ""

    firstSymbol = if (input.isEmpty() || input.isBlank()) {
        "none"
    } else {
        input.first().toString()
    }

    when (firstSymbol) {
        "i" -> {
            val newInput = input.drop(1).toInt()
            println(newInput + 1)
        }
        "s" -> {
            val newInput = input.drop(1)
            println(newInput.reversed())
        }
        else -> println(input)
    }
}