package org.example.ObserverDesignPattern;

public class EmailService implements OnOrerPlacedSubscriber {

    EmailService() {
        FlipKart flipKart = FlipKart.getInstance();
        flipKart.registerSubscriber(this);
    }

    @Override
    public void announceOrderPlaced() {
        System.out.println("Sending Email");
    }
}
