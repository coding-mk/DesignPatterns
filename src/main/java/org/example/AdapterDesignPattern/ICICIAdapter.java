package org.example.AdapterDesignPattern;

import org.example.AdapterDesignPattern.ThirdParty.ICICI.ICICIBank;

public class ICICIAdapter implements BankAPI {
    private ICICIBank iciciBank = new ICICIBank();

    @Override
    public void sendMoney(String from, String to, int amount) {
        iciciBank.makePayment(from, to, amount);
    }

    @Override
    public void registerAccount(String accountNumber) {

    }

    @Override
    public long getBalance(String accountNumber) {
        return 0;
    }
}
