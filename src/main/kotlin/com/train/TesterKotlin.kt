package com.train

import java.util.*

fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`);
    
    print("Please enter number of tickets: ");
    val ticketNum = scanner.nextInt();

    print("How many round-trip tickets: ");
    val ticketRoundNum = scanner.nextInt();

    val ticketBean = TicketBean(ticketNum, ticketRoundNum);
    println(ticketBean.printCost());
}

class TicketSale(var ticketNum: Int, var ticketRoundNum: Int) {
    private val SINGLE_FEE: Int = 1000;
    private val ROUND_OFF: Double = 0.9;
    fun printCost(): String {
        when (ticketRoundNum > ticketNum) {
            true -> {
                return "Error";
            }
            false -> {
                val singleCost: Int = (ticketNum - ticketRoundNum) * SINGLE_FEE;
                val roundCost: Double = ticketRoundNum * SINGLE_FEE * 2 * ROUND_OFF;
                val totalCost: Int = singleCost + roundCost.toInt();
                return "Total tickets: $ticketNum\nRound-trip: $ticketRoundNum\nTotal: $totalCost";
            }
        }
    }
}