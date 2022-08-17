package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<City> set = new TreeSet<>(City.comparator);
        Set<City> list = new HashSet<>();

        City city1 = new City(495, "Москва");
        City city2 = new City(331, "Париж");
        City city3 = new City(202, "Вашингтон");
        City city4 = new City(996, "Бишкек");
        City city5 = new City(3, "Токио");

        list.add(city1);
        list.add(city2);
        list.add(city3);
        list.add(city4);
        list.add(city5);

        for(City i : list){
            if(i.getCode() % 2 == 0){
                set.add(i);
            }
        }
        System.out.println(set);
    }
}