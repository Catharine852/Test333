package com.abs.unit3.shape;

public class Circle implements Shape {

    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getSquare() {
        return radius * radius * Math.PI;
    }
}
