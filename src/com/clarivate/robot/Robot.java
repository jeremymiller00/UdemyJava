package com.clarivate.robot;

class Robot {
    public String name;
    public Integer age;

    public Robot() { // Constructor
        System.out.println("Constructor running...");
        age = 99;
        name = "R2D2";

    public Robot(String name) {
        System.out.println("2nd constructor...");
        this.name=name;
        }

    }
}


