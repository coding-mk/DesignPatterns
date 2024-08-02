package org.example.ObserverDesignPattern;

public class InvoiceGenerator implements OnOrerPlacedSubscriber{
    InvoiceGenerator() {
        FlipKart flipKart = FlipKart.getInstance();
        flipKart.registerSubscriber(this);
    }

    @Override
    public void announceOrderPlaced() {
        System.out.println("Generating invoice");
    }
}
