package com.clarivate.robot;

class Robot {
    public String name;
    public Integer age;
    public static String description;
    public final static int luckyNumber = 7;
    public static int count = 0;
    private int id;


    public Robot() { // Constructor
        this("Karat", 67);
        System.out.println("Constructor running...");
        id = count;
        count++;
//        age = 99;
//        name = "R2D2";
    }

    public Robot(String name) { // Constructor
        System.out.println("2nd Constructor running...");
        this.name=name;
    }

    public Robot(String name, int age) { // Constructor which takes a String
        System.out.println("3rd constructor...");
        this.name=name;
        this.age=age;
        }

    public void showName() {
        System.out.println("Hello! My name is " + name + ".  My id is: " + id + ". " + description);
    }

    public static void showInfo() {
        System.out.println(description );
    }



    }


