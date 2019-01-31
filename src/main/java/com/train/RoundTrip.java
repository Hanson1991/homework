package com.train;

public class RoundTrip extends Ticket{

    public RoundTrip(String startPoint, String endPoint, int unitPrice) {
        super(startPoint, endPoint, unitPrice);
    }

    @Override
    public int calc(int number) {
        return (int)(unitPrice * number * 0.9);
    }
}
