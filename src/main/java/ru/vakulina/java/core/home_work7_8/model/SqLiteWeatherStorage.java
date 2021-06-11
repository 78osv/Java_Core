package ru.vakulina.java.core.home_work7_8.model;

import jdk.internal.icu.impl.CharacterIteratorWrapper;
import ru.vakulina.java.core.home_work7_8.GlobalState;
import ru.vakulina.java.core.home_work7_8.entity.WeatherObject;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SqLiteWeatherStorage implements ILocalStorageProvider {

    static {
        try {
            GlobalState.getInstance()
                    .getConnection()
                    .createStatement()
                    .executeUpdate("CREATE TABLE IF NOT EXISTS weather (id INTEGER PRIMARY KEY AUTOINCREMENT, city TEXT, date TEXT, weather TEXT)");
        } catch (SQLException throwables) {
            throwables.printStackTrace();

        }

    }

    public List<WeatherObject> readWeatherFromDb() throws SQLException {
        List<WeatherObject> weatherObjects = new ArrayList<WeatherObject>();
        Connection connection = DriverManager.getConnection("jdbc:sqlite:" + GlobalState.getInstance().DB_NAME);
        Statement statement = connection.createStatement();;
        ResultSet resultSet = statement.executeQuery("ALL");
        while (resultSet.next()) {
            String city = resultSet.getString(2);
            String date = resultSet.getString(3);
            String weather = resultSet.getString(4);
            WeatherObject weatherObject = new WeatherObject(city, date, weather);
            weatherObjects.add((WeatherObject) weatherObjects);
            System.out.println("In "+ city + " on the date " + date + "expected" + weather);
        }
        return weatherObjects;
    }


    @Override
    public void saveWeather(WeatherObject weatherObject) {

    }

    @Override
    public List<WeatherObject> getAllWeather() {
        return null;
    }

}
