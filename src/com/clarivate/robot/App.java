package com.clarivate.robot;

public class App {
    public static void main(String[] args) {
//        Robot R2D2 = new Robot();
//        System.out.println((R2D2.name));
//        System.out.println((R2D2.age));

//        Robot C3PO = new Robot("C3PO");
//        System.out.println(C3PO.name);

//        Robot R5D4 = new Robot("R5D4", 42);
//        System.out.println(R5D4.name, R5D4.age);

        Robot.description = "I am a robot!"; // class variables, every instance has the same variable

        System.out.println("Initial Count: "+Robot.count);
        System.out.println(Robot.description);

        Robot robo1 = new Robot();
        Robot robo2 = new Robot();
        Robot robo3 = new Robot();

        robo1.name = "Yup"; // instance variables
        robo2.name = "Nope"; // every instance gets in own copy

//        System.out.println(robo1.name);
//        System.out.println(robo2.name);

        robo1.showName(); // instance methods
        robo2.showName();

//        robo1.showInfo();
//        robo2.showInfo();

//        System.out.println(robo1.description);
//        System.out.println(Math.PI);
//        System.out.println(Robot.luckyNumber);
        System.out.println("Current Count: "+Robot.count);



    }
}