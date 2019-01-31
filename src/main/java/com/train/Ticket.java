package com.train;

public class Ticket {
    String startPoint;
    String endPoint;
    int unitPrice;


    public Ticket(String startPoint, String endPoint, int unitPrice) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.unitPrice = unitPrice;
    }

    public int calc(int number) {
        return 1000 * number;
    }
}

