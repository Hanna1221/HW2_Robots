package main.java.robot;

import main.java.planet.Planet;

public class Robot implements Planet {
    private String model;
    private double speed;
    private double workArea;

    public Robot(String model, double speed, double workArea) {
        this.model = model;
        this.speed = speed;
        this.workArea = workArea;
    }
    public void run() {
        System.out.println("Start moving.");
    }
    public void talk() {
        System.out.println("Hi I`m a robot. I have a crash in the program. ");
    }

    @Override
    public void suit(String typeSuit) {
        System.out.println("My armor is ");
    }

    public void bang() {
        System.out.println("I can kill you. Run away.");

    }
    public String getModel() {
        return model;
    }
    public double getSpeed() {
        return speed;
    }
    public double getWorkArea() {
        return workArea;
    }
}
