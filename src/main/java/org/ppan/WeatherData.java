package org.ppan;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private final List<Observer> observers;
    private final WeatherStats weatherStats = new WeatherStats();

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int idx = observers.indexOf(observer);
        if (idx >= 0) {
            observers.remove(idx);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(weatherStats);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void updateState(WeatherStats newStats) {
        weatherStats.updateState(newStats);
        measurementsChanged();
    }
}
