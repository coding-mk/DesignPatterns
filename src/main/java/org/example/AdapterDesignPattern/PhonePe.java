package org.example.AdapterDesignPattern;

public class PhonePe {

    private static BankAPI bankAPI = new ICICIAdapter();
    public static void main(String[] args) {
        bankAPI.sendMoney("Baba", "Me", 5000);
    }
}
