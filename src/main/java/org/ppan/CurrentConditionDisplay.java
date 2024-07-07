package org.ppan;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private Subject subject;
    private int temperature;
    private int humidity;
    private int windSpeed;

    public CurrentConditionDisplay(Subject subject) {
        this.subject = subject;
        System.out.println("hey");
        subject.registerObserver(this);
        System.out.println("mm");
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
        System.out.printf("Current Conditions are: temperature=%d C, humidity=%d %%, windspeed=%d kmph\n", temperature, humidity, windSpeed);
    }
}
