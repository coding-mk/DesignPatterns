package org.example.ObserverDesignPattern;

public class InventoryService implements OnOrerPlacedSubscriber {

    InventoryService() {
        FlipKart flipKart = FlipKart.getInstance();
        flipKart.registerSubscriber(this);
    }

    @Override
    public void announceOrderPlaced() {
        System.out.println("Notifying Inventory");
    }
}
