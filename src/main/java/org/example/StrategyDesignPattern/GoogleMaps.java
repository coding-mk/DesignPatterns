package org.example.StrategyDesignPattern;

public class GoogleMaps {
    public void findPath(String from, String to, PathMode mode){
        PathCalculatorStrategy pathCalculatorStrategy =
                PathCalculatorFactory.getPathCalculatorForMode(mode);
        pathCalculatorStrategy.findPath(from, to);
    }
}
