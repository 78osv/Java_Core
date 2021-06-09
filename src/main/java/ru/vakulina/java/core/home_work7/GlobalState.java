package ru.vakulina.java.core.home_work7;

public final class GlobalState {

    private static GlobalState INSTANCE;
    private String selectedCity = null;
    public final String API_KEY ="B1jTGUrcUhjw2jEIMG5I7l8vjMpVbFou";

    private GlobalState() { }

    public static GlobalState getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new GlobalState();
        }
        return INSTANCE;
    }

    public String getSelectedCity() {
        return selectedCity;
    }

    public void setSelectedCity(String selectedCity) {
        this.selectedCity = selectedCity;
    }
}
