package com.abs.unit3;

public class Main {
    public static void main(String[] args) {

        BalletDancingRobot robot = new BalletDancingRobot();

        printRobot(robot);
        printRobot(new FolkDancingRobot());
    }

    private static void printRobot(DancingRobot robot) {
        System.out.println("++++++++++++++++++++");
        System.out.println("Dance type1" + robot.getDanceType1());
        System.out.println("Dance type2" + robot.getDanceType2());
        System.out.println("Default Dance type" + robot.getDefaultType());
        System.out.println("++++++++++++++++++++\n");
    }
}