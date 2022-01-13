const val PARTS_NUMBER_CARD = 4
const val SIZE_NUMBER_CARD = 19

fun parseCardNumber(cardNumber: String): Long {
    if (cardNumber.isNullOrEmpty() || cardNumber.isBlank()) {
        throw NumberFormatException("The card number must be informed!")
    }

    val cardNumberParts = cardNumber.split(" ")

    if (cardNumberParts.size != PARTS_NUMBER_CARD || cardNumber.length != SIZE_NUMBER_CARD) {
        throw NumberFormatException("Card number is invalid!")
    } else {
        for (element in cardNumberParts) {
            if (element.length != PARTS_NUMBER_CARD) {
                throw NumberFormatException("Card number is invalid!")
            }
        }
    }

    return cardNumberParts.joinToString("").toLong()
}