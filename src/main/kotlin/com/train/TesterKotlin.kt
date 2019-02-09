package com.train

import java.util.*

fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`);

    while (true){
        println("Do you want to leave, please enter ( -1 ) : ");
        print("Please enter number of tickets: ");
        val ticketNum = scanner.nextInt();
        if (ticketNum == -1) {
            println("Leave order system");
            break;
        }

        print("How many round-trip tickets: ");
        val ticketRoundNum = scanner.nextInt();
        if (ticketRoundNum == -1) {
            println("Leave order system");
            break;
        }

        println("${TicketBean(ticketNum, ticketRoundNum).printCost()}");
    }
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