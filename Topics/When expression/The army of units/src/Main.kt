const val ONE = 1
const val FOUR = 4
const val FIVE = 5
const val NINE = 9
const val TEN = 10
const val NINE_TEEN = 19
const val TWENTY = 20
const val FOURTY_NINE = 49
const val FIFTY = 50
const val NINETY_NINE = 99
const val ONE_HUNDRED = 100
const val TWO_HUNDRED_FOURTY_NINE = 249
const val TWO_HUNDRED_FIFTY = 250
const val FOUR_HUNDRED_NINETY_NINE = 499
const val FIVE_HUNDRED = 500
const val NINE_HUNDRED_NINETY_NINE = 999
const val ONE_THOUSAND = 1000

fun main() {
    val numberOfUnits = readLine()!!.toInt()

    when {
        numberOfUnits < ONE -> println("no army")
        numberOfUnits in ONE..FOUR -> println("few")
        numberOfUnits in FIVE..NINE -> println("several")
        numberOfUnits in TEN..NINE_TEEN -> println("pack")
        numberOfUnits in TWENTY..FOURTY_NINE -> println("lots")
        numberOfUnits in FIFTY..NINETY_NINE -> println("horde")
        numberOfUnits in ONE_HUNDRED..TWO_HUNDRED_FOURTY_NINE -> println("throng")
        numberOfUnits in TWO_HUNDRED_FIFTY..FOUR_HUNDRED_NINETY_NINE -> println("swarm")
        numberOfUnits in FIVE_HUNDRED..NINE_HUNDRED_NINETY_NINE -> println("zounds")
        numberOfUnits >= ONE_THOUSAND -> println("legion")
    }
}