package ru.vakulina.java.core.home_work7_8.controller;

import ru.vakulina.java.core.home_work7_8.model.*;

public class WeatherController implements IWeatherController {

    private IWeatherRepository weatherRepository = new WeatherRepository();

    @Override
    public void onUserInput(int command) {

        switch (command) {
            case 1:
                getCurrentWeather();
                break;
            case 2:
                getFiveDays();
                break;
            case 3:
                getAllFromDb();
            default:
                System.out.println("НЕТ ТАКОЙ КОМАНДЫ!");
                System.exit(1);
        }
    }

    private void getCurrentWeather() {

        weatherRepository.fetchWeatherFromApi(Period.NOW);
    }
    private void getFiveDays() {
        weatherRepository.fetchWeatherFromApi(Period.FIVE_DAYS);
    }
    private void getAllFromDb() {
        weatherRepository.readWeatherFromDb();
    }
}
