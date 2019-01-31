package com.train;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Ticket singleTrip = new Ticket("台北","高雄", 1000);
        Ticket roundTrip = new RoundTrip("台北","高雄", 2000);
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of tickets:");
        int numberOfTicket = input.nextInt();
        System.out.println("How many round-trip tickets:");
        int numberOfRoundTicket = input.nextInt();
        System.out.println("Total Tickets: " + numberOfTicket);
        System.out.println("Round-trip: " + numberOfRoundTicket);
        System.out.println("Total: " + (singleTrip.calc(numberOfTicket-numberOfRoundTicket) + roundTrip.calc(numberOfRoundTicket)));
    }
}
