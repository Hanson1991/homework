package com.train

import java.util.*

fun main(args: Array<String>) {
    val singleTrip = Ticket("台北", "高雄", 1000)
    val roundTrip = RoundTrip("台北", "高雄", 2000)
    val input = Scanner(System.`in`)
    println("Please enter number of tickets:")
    val numberOfTicket = input.nextInt()
    println("How many round-trip tickets:")
    val numberOfRoundTicket = input.nextInt()
    println("Total Tickets: " + numberOfTicket)
    println("Round-trip: " + numberOfRoundTicket)
    println("Total: " + (singleTrip.calc(numberOfTicket - numberOfRoundTicket) + roundTrip.calc(numberOfRoundTicket)))
}
