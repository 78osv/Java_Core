package ru.vakulina.java.core.home_work7_8.model;

import ru.vakulina.java.core.home_work7_8.entity.WeatherObject;

import java.util.List;

public class WeatherRepository implements IWeatherRepository{
    IWeatherProvider apiWeatherProvider = new AccuWeatherProvider();
    ILocalStorageProvider localStorageProvider = new SqLiteWeatherStorage();

    @Override
    public List<WeatherObject> fetchWeatherFromApi(Period period) {
        List<WeatherObject> weather = apiWeatherProvider.getWeather(period);
        System.out.println(weather);
        saveWeatherInfoInDb(weather);
        return weather;
    }

    @Override
    public List<WeatherObject> readWeatherFromDb() {
        List<WeatherObject> dbResult = localStorageProvider.getAllWeather();
        System.out.println(dbResult);
        return dbResult;
    }

    @Override
    public void saveWeatherInfoInDb(List<WeatherObject> weatherObjects) {
        for (WeatherObject weatherObject: weatherObjects) {
            localStorageProvider.saveWeather(weatherObject);
        }
    }

}
