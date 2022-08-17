package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<City> cities = new HashSet<>();
        Set<City> set = new TreeSet<>(City.comparator);


        set.add(new City(495, "Москва"));
        set.add(new City(331, "Париж"));
        set.add(new City(202, "Вашингтон"));
        set.add(new City(996, "Бишкек"));
        set.add(new City(3, "Токио"));

        for(City i : set){
            if(i.getCode() % 2 == 0){
                System.out.println(i);
            }
        }
    }
}