package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    // Implemented according to TDD step 7 (GREEN phase)
    public boolean hasCity(City city) {
        return cities.contains(city);

    }
    public boolean deleteCity(City city) {
        return cities.remove(city);
    }
    public int countCities() {
        return 0;
    }
}
