package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter number of tickets: ");
        int ticketNum = scanner.nextInt();

        System.out.print("How many round-trip tickets: ");
        int ticketRoundNum = scanner.nextInt();

        TicketBean ticketBean = new TicketBean(ticketNum, ticketRoundNum);
        System.out.println(ticketBean.printCost());
    }
}
