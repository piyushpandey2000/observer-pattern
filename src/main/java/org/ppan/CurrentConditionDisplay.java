package org.ppan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private static final Logger logger = LoggerFactory.getLogger(CurrentConditionDisplay.class);

    private Subject subject;
    private int temperature;
    private int humidity;
    private int windSpeed;

    public CurrentConditionDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(Object updates) {
        if (updates instanceof WeatherStats weatherStats) {
            this.temperature = weatherStats.getTemperature();
            this.humidity = weatherStats.getHumidity();
            this.windSpeed = weatherStats.getWindSpeed();

            display();
        }
    }

    @Override
    public void display() {
        logger.info("Current Conditions are: temperature={}C, humidity={}%, windspeed={}kmph", temperature, humidity, windSpeed);
    }
}
