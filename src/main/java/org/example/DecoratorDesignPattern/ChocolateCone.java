package org.example.DecoratorDesignPattern;

public class ChocolateCone implements IceCream {
    private IceCream iceCream;

    public ChocolateCone() {}

    public ChocolateCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }


    @Override
    public int getCost() {
        if(iceCream != null){
            return iceCream.getCost() + 30;
        }
        return 30;
    }

    @Override
    public String getDescription() {
        if(iceCream != null){
            return iceCream.getDescription() + " + Chocolate cone";
        }
        return "Chocolate cone";
    }
}
