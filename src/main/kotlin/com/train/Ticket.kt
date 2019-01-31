package com.kotlin.train

open class Ticket(internal var startPoint: String, internal var endPoint: String, internal var unitPrice: Int) {

    open fun calc(number: Int): Int {
        return 1000 * number
    }
}