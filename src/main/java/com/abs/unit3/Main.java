package com.abs.unit3;

public class Main {
    public static void main(String[] args) {

        DancingRobot robot = new BalletDancingRobot();
        DancingRobot robot1 = new FolkDancingRobot();

        printRobotDanceTypes(robot);
        printRobotDanceTypes(robot1);
    }

    private static void printRobotDanceTypes(DancingRobot robot) {
        System.out.println(robot.getDanceType1());
        System.out.println(robot.getDanceType2());
        System.out.println(robot.getDefaultType());
        System.out.println("++++++++++++++++++++\n");
    }
}