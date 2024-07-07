package org.ppan;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.updateState(new WeatherStats(38, 80, 4));
        weatherData.updateState(new WeatherStats(42, 89, 2));
    }
}