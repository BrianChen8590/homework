package com.train;

public class TicketBean {

    private int ticketNum;
    private int ticketRoundNum;

    private final int SINGLE_FEE = 1000;
    private final double ROUND_OFF = 0.9;

    public TicketBean(int ticketNum, int ticketRoundNum) {
        this.ticketNum = ticketNum;
        this.ticketRoundNum = ticketRoundNum;
    }

    public String printCost() {
        if (ticketRoundNum > ticketNum) {
            return "Error";
        } else {
            int singleCost = (ticketNum - ticketRoundNum) * SINGLE_FEE;
            double roundCost = ticketRoundNum * SINGLE_FEE * 2 * ROUND_OFF;
            int totalCost = singleCost + (int) roundCost;
            return "Total tickets:" + ticketNum + "\nRound-trip:" + ticketRoundNum + "\nTotal: " + totalCost + "\n";
        }
    }
}
