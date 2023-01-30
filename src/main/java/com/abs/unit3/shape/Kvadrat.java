package com.abs.unit3.shape;

public class Kvadrat extends Rectangle{

    private double side1;
    public Kvadrat(double side) {
        super(side, side);
        side1 = 1000.1;
        super.side1 = 100;
    }

    public double getSquareSide(){
        return side1;
    }

}
