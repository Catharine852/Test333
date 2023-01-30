package com.abs.unit3;

public abstract class DancingRobot {

    public String getDefaultType() {
        return getDanceType1();
    }
    public abstract String getDanceType1();
    public abstract String getDanceType2();

}
