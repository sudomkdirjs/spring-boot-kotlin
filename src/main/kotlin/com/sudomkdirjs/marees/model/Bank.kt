package com.sudomkdirjs.marees.model

/**
 * Primary Constructor used here.
 * By default Kotlin data class will have default implementation of equals, hashCode and toString methods
 */
data class Bank(
    val accountNumber: String,
    val trust: Double,
    val transactionFee: Int) {
}