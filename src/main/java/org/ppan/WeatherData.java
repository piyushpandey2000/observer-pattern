package org.ppan;

import lombok.CustomLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private static final Logger logger = LoggerFactory.getLogger(WeatherData.class);

    private final List<Observer> observers;
    private final WeatherStats weatherStats = new WeatherStats();

    public WeatherData() {
        logger.info("hhhhi");
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        System.out.println(":hey");
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
