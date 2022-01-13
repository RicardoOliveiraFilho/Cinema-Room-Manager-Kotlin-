package cinema

const val TICKET_PRICE_FRONT_HALF = 10
const val TICKET_PRICE_BACK_HALF = 8

fun createTheTheatre(numberRows: Int, numberSeatsByRow: Int): MutableList<MutableList<Char>> {
    val theatre: MutableList<MutableList<Char>> = mutableListOf()

    for (i in 0 until numberRows) {
        val seats = "S".repeat(numberSeatsByRow).toMutableList()
        theatre.add(seats)
    }

    return theatre
}

fun showTheSeats(numberSeatsByRow: Int, numberRows: Int, theatre: MutableList<MutableList<Char>>) {
    println("\nCinema:")
    for (i in 1..numberSeatsByRow) {
        when (i) {
            1 -> print("  $i ")
            numberSeatsByRow -> print("$i\n")
            else -> print("$i ")
        }
    }

    for (i in 1..numberRows) {
        println("$i ${theatre[i - 1].joinToString(" ")}")
    }
}

fun buyATicket(numberRows: Int, numberSeatsByRow: Int, theatre: MutableList<MutableList<Char>>) {
    do {
        var ticketAlreadyPurchased = false
        var wrongInput = false

        println("\nEnter a row number:")
        val rowNumber = readLine()!!.toInt()

        println("Enter a seat number in that row:")
        val seatNumber = readLine()!!.toInt()

        val totalSeats = numberRows * numberSeatsByRow

        if ((rowNumber - 1) in theatre.indices) {
            val rowSelected = theatre[rowNumber - 1]

            if ((seatNumber - 1) in rowSelected.indices) {
                if (rowSelected[seatNumber - 1] != 'B') {
                    rowSelected.removeAt(seatNumber - 1)
                    rowSelected.add(seatNumber - 1, 'B')
                } else {
                    ticketAlreadyPurchased = true
                }
            } else {
                wrongInput = true
            }
        } else {
            wrongInput = true
        }

        if (!wrongInput && !ticketAlreadyPurchased) {
            if (totalSeats <= 60) {
                println("\nTicket price: $$TICKET_PRICE_FRONT_HALF")
            } else {
                if (rowNumber <= numberRows / 2) {
                    println("\nTicket price: $$TICKET_PRICE_FRONT_HALF")
                } else {
                    println("\nTicket price: $$TICKET_PRICE_BACK_HALF")
                }
            }
        } else {
            if (wrongInput) {
                println("\nWrong input!")
            } else {
                println("\nThat ticket has already been purchased!")
            }
        }
    } while (wrongInput || ticketAlreadyPurchased)
}

fun getPurchasedTickets(theatre: MutableList<MutableList<Char>>): Int {
    var purchasedTickets = 0

    for (i in 0 until theatre.size) {
        for (j in 0 until theatre[i].size) {
            if (theatre[i][j] == 'B') {
                purchasedTickets += 1
            }
        }
    }

    return purchasedTickets
}

fun getPurchasedTicketsAsPercentage(purchasedTickets: Int, numberRows: Int, numberSeatsByRow: Int): String {
    return roundOffDecimal((purchasedTickets.toDouble() * 100) / (numberRows.toDouble() * numberSeatsByRow.toDouble()))
}

fun roundOffDecimal(number: Double): String {
    return String.format("%.2f", number)
}

fun showStatistics(theatre: MutableList<MutableList<Char>>, numberRows: Int, numberSeatsByRow: Int) {
    val purchasedTickets = getPurchasedTickets(theatre)
    println("\nNumber of purchased tickets: $purchasedTickets")

    val percentage = getPurchasedTicketsAsPercentage(purchasedTickets, numberRows, numberSeatsByRow)
    println("Percentage: $percentage%")

    getIncomes(theatre, numberRows, numberSeatsByRow)
}

fun getIncomes(theatre: MutableList<MutableList<Char>>, numberRows: Int, numberSeatsByRow: Int) {
    val totalSeats = numberRows * numberSeatsByRow

    if (totalSeats <= 60) {
        val purchasedTickets = getPurchasedTickets(theatre)
        println("Current income: $${purchasedTickets * TICKET_PRICE_FRONT_HALF}")
        println("Total income: $${totalSeats * TICKET_PRICE_FRONT_HALF}")
    } else {
        var purchasedTicketsFrontHalf = 0
        var purchasedTicketsBackHalf = 0
        var ticketsFrontHalf = 0
        var ticketsBackHalf = 0

        for (i in 0 until theatre.size) {
            for (j in 0 until theatre[i].size) {
                if (theatre[i][j] == 'B') {
                    if (i < numberRows / 2) {
                        purchasedTicketsFrontHalf += 1
                    } else {
                        purchasedTicketsBackHalf += 1
                    }
                } else {
                    if (i < numberRows / 2) {
                        ticketsFrontHalf += 1
                    } else {
                        ticketsBackHalf += 1
                    }
                }
            }
        }

        println("Current income: $${(purchasedTicketsFrontHalf * TICKET_PRICE_FRONT_HALF) +
            (purchasedTicketsBackHalf * TICKET_PRICE_BACK_HALF)}")

        println("Total income: $${((ticketsFrontHalf + purchasedTicketsFrontHalf) * TICKET_PRICE_FRONT_HALF) +
            ((ticketsBackHalf + purchasedTicketsBackHalf) * TICKET_PRICE_BACK_HALF)}")
    }
}

fun main() {
    println("Enter the number of rows:")
    val numberRows = readLine()!!.toInt()

    println("Enter the number of seats in each row:")
    val numberSeatsByRow = readLine()!!.toInt()

    val theatre = createTheTheatre(numberRows, numberSeatsByRow)

    var optionMenu: Int
    do {
        println("\n1. Show the seats")
        println("2. Buy a ticket")
        println("3. Statistics")
        println("0. Exit")

        optionMenu = readLine()!!.toInt()

        when(optionMenu) {
            1 -> showTheSeats(numberSeatsByRow, numberRows, theatre)
            2 -> buyATicket(numberRows, numberSeatsByRow, theatre)
            3 -> showStatistics(theatre, numberRows, numberSeatsByRow)
        }
    } while (optionMenu > 0)
}