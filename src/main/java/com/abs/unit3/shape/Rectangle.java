package com.abs.unit3.shape;

public class Rectangle implements Shape{

    private final double side1;
    private final double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getSquare() {
        return side1 * side2;
    }
}
