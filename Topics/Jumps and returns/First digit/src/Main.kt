fun main() {
    val input = readLine()!!

    for (char in input) {
        if (char in '0'..'9') {
            println(char)
            break
        } else {
            continue
        }
    }
}