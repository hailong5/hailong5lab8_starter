package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {

    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        // This test verifies that hasCity() correctly identifies an added city
        assertTrue(list.hasCity(calgary));
    }
    @Test
    public void testDeleteCityWhenPresent() {
        CustomList list = new CustomList();
        City vancouver = new City("Vancouver", "BC");
        list.addCity(vancouver);

        assertTrue(list.deleteCity(vancouver), "deleteCity should return true when city was present.");
        assertFalse(list.hasCity(vancouver), "City should no longer be present after deletion.");
    }
}