package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Do you want to leave, please enter ( -1 ) : ");
            System.out.print("Please enter number of tickets: ");
            int ticketNum = scanner.nextInt();

            if (ticketNum == -1) {
                System.out.println("Leave order system");
                break;
            }

            System.out.print("How many round-trip tickets: ");
            int ticketRoundNum = scanner.nextInt();

            if (ticketRoundNum == -1) {
                System.out.println("Leave order system");
                break;
            }

            TicketBean ticketBean = new TicketBean(ticketNum, ticketRoundNum);
            System.out.println(ticketBean.printCost());
        }
    }
}
