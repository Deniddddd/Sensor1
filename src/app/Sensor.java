package app;

import java.util.ArrayList;
import java.util.List;

class Sensor {
    private List<Observer> observers = new ArrayList<>();
    private int temperature;
    private int weight;
    private String color;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setState(int temperature) {
        this.temperature = temperature;
        if (temperature <= 0) {
            this.weight = 1;
            this.color = "Білий";
        } else {
            this.weight = 1 + (temperature * 2);
            this.color = "Чорний";
        }
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, weight, color);
        }
    }
}