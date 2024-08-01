package org.example.StrategyDesignPattern;

public class Client {
    public static void main(String[] args) {
        GoogleMaps googleMaps = new GoogleMaps();
        googleMaps.findPath("Nagpur", "Pune", PathMode.CAR);
    }
}
