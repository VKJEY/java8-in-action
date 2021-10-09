package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericVerboseAppleFilter {
    
    public static List<Apple> filterApple(List<Apple> inventory, ApplePredicate predicate) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    static class RedApplePredicate implements ApplePredicate {

        @Override
        public boolean test(Apple a) {
            return a.getColor().equals("red");
        }
    }

    public static void main(String[] args) {
        List<Apple> inventory = filterApple(Arrays.asList(new Apple(), new Apple()), new RedApplePredicate());

        filterApple(inventory, new ApplePredicate(){
            @Override
            public boolean test(Apple a) {
                return a.getColor().equals("green") && a.getWeight() > 20;
            }
        });

        filterApple(inventory, new ApplePredicate(){
            @Override
            public boolean test(Apple a) {
                return a.getWeight() > 200;
            }
        });

        filterApple(inventory, (Apple a) -> a.getColor().equals("red"));
    }
}
