package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;

public class ConstructorReferenceExample {
    
    public static void main(String[] args) {
        Supplier<Apple> supplier = Apple::new;
        Apple apple1 = supplier.get();

        Supplier<Apple> supplier2 = () -> new Apple();
        Apple apple2 = supplier2.get();

        /**
         * If you have a constructor with signature Apple(Integer weight), it fits the signature of the
         * Function interface, so you can do this,
         */

         IntFunction<Apple> func = Apple::new;
         func.apply(20);
         map(Arrays.asList(10,20,30), Apple::new);
    }

    public static List<Apple> map(List<Integer> weights, Function<Integer, Apple> f) {
        List<Apple> apples = new ArrayList<>();
        for(Integer w: weights) {
            apples.add(f.apply(w));
        }
        return apples;
    }
}
