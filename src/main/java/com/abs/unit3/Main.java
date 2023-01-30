package com.abs.unit3;
import com.abs.unit3.robots.BalletDancingRobot;
import com.abs.unit3.robots.DancingRobot;
import com.abs.unit3.robots.FolkDancingRobot;
import com.abs.unit3.robots.JazzDancingRobot;

public class Main {
    public static void main(String[] args) {

        BalletDancingRobot robot = new BalletDancingRobot(); // var robot = new BalletDancingRobot();
        printRobot(robot);

        printRobot(new FolkDancingRobot());
        printRobot(new JazzDancingRobot());
    }

    private static void printRobot(DancingRobot robot) {
        System.out.println("++++++++++++++++++++");
        System.out.println("Dance type1 " + robot.getDanceType1());
        System.out.println("Dance type2 " + robot.getDanceType2());
        System.out.println("Default Dance type " + robot.getDefaultType());
        System.out.println("++++++++++++++++++++\n");
    }
}