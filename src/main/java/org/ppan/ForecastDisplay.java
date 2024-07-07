package org.ppan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ForecastDisplay implements Observer, DisplayElement {
    private static final Logger logger = LoggerFactory.getLogger(ForecastDisplay.class);

    private Subject subject;
    private String forecast;

    public ForecastDisplay(Subject subject) {
        this.subject = subject;
        forecast = "NO IDEA";
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        logger.info("According to current conditions, tomorrow's forecast: {}", forecast);
    }

    @Override
    public void update(Object obj) {
        if (obj instanceof WeatherStats weatherStats) {
            if (weatherStats.getTemperature() > 40) {
                forecast = "HOT";
            } else if (weatherStats.getTemperature() > 30) {
                forecast = "SUNNY";
            } else {
                forecast = "CLOUDY";
            }
        }
        display();
    }
}
