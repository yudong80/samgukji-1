package com.threekingdoms;

import java.util.ArrayList;
import java.util.List;

public class CityData {
    public static List<City> getCities() {
        List<City> cities = new ArrayList<>();

        // 허창(수도) 및 인근 도시들
        cities.add(new City("허창", 150000, 85, 90, 50000, 80000));
        cities.add(new City("낙양", 180000, 80, 95, 60000, 90000));

        // 허창, 낙양 인근 도시들
        cities.add(new City("여남", 80000, 75, 70, 25000, 40000));
        cities.add(new City("영천", 70000, 70, 65, 20000, 35000));
        cities.add(new City("진류", 90000, 78, 75, 30000, 45000));
        cities.add(new City("동군", 85000, 72, 68, 22000, 38000));
        cities.add(new City("하내", 95000, 80, 82, 35000, 50000));
        cities.add(new City("홍농", 60000, 68, 60, 18000, 30000));
        cities.add(new City("삼천", 55000, 65, 58, 15000, 28000));
        cities.add(new City("신야", 75000, 73, 71, 24000, 36000));

        return cities;
    }
}