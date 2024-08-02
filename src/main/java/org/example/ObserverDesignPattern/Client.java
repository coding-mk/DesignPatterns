package org.example.ObserverDesignPattern;

public class Client {
    public static void main(String[] args) {
        FlipKart flipKart = FlipKart.getInstance();
        EmailService emailService = new EmailService();
        InventoryService inventoryService = new InventoryService();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

        flipKart.onOrderPlaced();

    }
}
