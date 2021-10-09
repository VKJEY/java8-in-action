package com.example;

import java.util.ArrayList;
import java.util.List;

public class NaiveInventoryFilter {

    /**
     * 1. A very naive implementation. Color is hardcoded.
     * 
     * @param inventory
     * @return
     */
    public List<Apple> filterGreenApple(List<Apple> inventory) {

        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if (apple.getColor().equals("green")) {
                result.add(apple);
            }
        }
        return result;
    }

    /**
     * 1. A very naive implementation. Color is parametrized. Can filter apple of
     * all colors
     * 
     * @param inventory
     * @return
     */
    public List<Apple> filterApple(List<Apple> inventory, String color) {

        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if (apple.getColor().equals(color)) {
                result.add(apple);
            }
        }
        return result;
    }

    /**
     * 2. FilterApple by Weight Can filter apple of all colors
     * 
     * There's a lot of duplication Still. Violates DRY principle. What if you want
     * to alter the filter traversing to enhance performance? You now have to modify
     * the implementation of all of your methods instead of a single one.
     * 
     * @param inventory
     * @return
     */
    public List<Apple> filterApple(List<Apple> inventory, double weight) {

        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if (apple.getWeight() == (weight)) {
                result.add(apple);
            }
        }
        return result;
    }

    public List<Apple> filterApple(List<Apple> inventory, double weight, String color, boolean flag) {

        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if ((flag && apple.getColor().equals(color)) || (!flag && apple.getWeight() == (weight))) {
                result.add(apple);
            }
        }
        return result;
    }

}
