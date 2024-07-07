package org.ppan;

public class WeatherStats {
    private int temperature;
    private int humidity;
    private int windSpeed;

    public WeatherStats() {
        temperature = 0;
        humidity = 0;
        windSpeed = 0;
    }

    public WeatherStats(int temperature, int humidity, int windSpeed) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
    }

    public void updateState(WeatherStats newStats) {
        this.temperature = newStats.temperature;
        this.humidity = newStats.humidity;
        this.windSpeed = newStats.windSpeed;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getWindSpeed() {
        return windSpeed;
    }
}
