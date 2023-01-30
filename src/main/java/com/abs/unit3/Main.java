package com.abs.unit3;
import com.abs.unit3.robots.BalletDancingRobot;
import com.abs.unit3.robots.DancingRobot;
import com.abs.unit3.robots.FolkDancingRobot;
import com.abs.unit3.robots.JazzDancingRobot;
import com.abs.unit3.shape.Circle;
import com.abs.unit3.shape.Rectangle;
import com.abs.unit3.shape.Shape;

public class Main {
    public static void main(String[] args) {
       // showRobotsHa();

        showShapesHa();

    }

    private static void showShapesHa() {
        Shape shape1 = new Rectangle(2, 3);
        Shape shape2 = new Rectangle(5, 2);

        System.out.println(shape1.getSquare());
        System.out.println(shape2.getSquare());

        shape1 = new Circle(10);
        System.out.println(shape1.getSquare());

        Circle shape3 = new Circle(9);
        System.out.println(shape3.getSquare());
        System.out.println(shape3.getRadius());

        System.out.println("****");
        Circle shape4 = new Circle(5);
        System.out.println(shape4.getRadius());
        shape4.setRadius(1);
        System.out.println(shape4.getRadius());

        System.out.println(shape3.getRadius());
    }
    private static void showRobotsHa() {
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