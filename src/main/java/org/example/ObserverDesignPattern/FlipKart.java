package org.example.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class FlipKart {
    private static FlipKart instance = null;
    private List<OnOrerPlacedSubscriber> onOrerPlacedSubscriberList = new ArrayList<>();

    private FlipKart() {}

    public static FlipKart getInstance() {
        if(instance == null){
            instance = new FlipKart();
        }
        return instance;
    }

    void registerSubscriber(OnOrerPlacedSubscriber onOrerPlacedSubscriber) {
        onOrerPlacedSubscriberList.add(onOrerPlacedSubscriber);
    }

    void unRegisterSubscriber(OnOrerPlacedSubscriber onOrerPlacedSubscriber){
        onOrerPlacedSubscriberList.remove(onOrerPlacedSubscriber);
    }

    public  void onOrderPlaced() {
        for(OnOrerPlacedSubscriber onOrerPlacedSubscriber : onOrerPlacedSubscriberList){
            onOrerPlacedSubscriber.announceOrderPlaced();
        }
    }
}
