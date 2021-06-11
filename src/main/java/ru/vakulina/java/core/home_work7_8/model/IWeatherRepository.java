package ru.vakulina.java.core.home_work7_8.model;

import ru.vakulina.java.core.home_work7_8.entity.WeatherObject;

import java.util.List;

public interface IWeatherRepository {

    List<WeatherObject> fetchWeatherFromApi(Period period);

    List<WeatherObject> readWeatherFromDb();

    void saveWeatherInfoInDb(List<WeatherObject> weatherObjects);
}
