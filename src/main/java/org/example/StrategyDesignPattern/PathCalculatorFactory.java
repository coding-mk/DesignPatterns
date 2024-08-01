package org.example.StrategyDesignPattern;

public class PathCalculatorFactory {

    public static PathCalculatorStrategy getPathCalculatorForMode(PathMode mode) {
        if(mode.equals(PathMode.CAR)){
            return new CarPathCalculator();
        }
        if(mode.equals(PathMode.BIKE)){
            return new BikePathCalculator();
        }
        if (mode.equals(PathMode.WALK)){
            return new WalkPathCalculator();
        }
        return null;
    }
}
