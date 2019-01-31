package com.kotlin.train


class RoundTrip(startPoint: String, endPoint: String, unitPrice: Int) : Ticket(startPoint, endPoint, unitPrice) {

    override fun calc(number: Int): Int {
        return 1000 * number
    }

}

