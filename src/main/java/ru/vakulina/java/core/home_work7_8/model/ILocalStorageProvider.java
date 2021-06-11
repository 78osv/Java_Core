package ru.vakulina.java.core.home_work7_8.model;

import ru.vakulina.java.core.home_work7_8.entity.WeatherObject;

import java.util.List;

public interface ILocalStorageProvider {
    void saveWeather(WeatherObject weatherObject);

    List<WeatherObject> getAllWeather();

}
