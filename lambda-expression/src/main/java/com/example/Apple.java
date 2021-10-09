package com.example;

public class Apple {

    private String color;

    private double weight;

    Apple(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
