package ru.vakulina.java.core.home_work7.controller;

import ru.vakulina.java.core.home_work7.model.AccuWeatherProvider;
import ru.vakulina.java.core.home_work7.model.IWeatherProvider;
import ru.vakulina.java.core.home_work7.model.Period;

public class WeatherController implements IWeatherController {

    private IWeatherProvider weatherProvider = new AccuWeatherProvider();

    @Override
    public void onUserInput(int command) {

        switch (command) {
            case 1:
                getCurrentWeather();
                break;
            case 2:
                getFiveDays();
                break;
            default:
                System.out.println("НЕТ ТАКОЙ КОМАНДЫ!");
                System.exit(1);
        }
    }

    private void getCurrentWeather() {
        weatherProvider.getWeather(Period.NOW);
    }
    private void getFiveDays() {
        weatherProvider.getWeather(Period.FIVE_DAYS);
    }
}
