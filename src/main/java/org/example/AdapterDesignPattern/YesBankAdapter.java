package org.example.AdapterDesignPattern;

import org.example.AdapterDesignPattern.ThirdParty.YesBank.YesBank;

public class YesBankAdapter implements BankAPI{
    YesBank yesBank = new YesBank();
    @Override
    public void sendMoney(String from, String to, int amount) {
        yesBank.makePayment(to,from,amount);
    }

    @Override
    public void registerAccount(String accountNumber) {

    }

    @Override
    public long getBalance(String accountNumber) {
        return 0;
    }
}
