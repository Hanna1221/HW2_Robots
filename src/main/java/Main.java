package main.java;

import main.java.planet.ListPlanet;
import main.java.robot.Robot;
import main.java.robot.RobotFirst;
import main.java.robot.RobotUpgrade;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        // rand for form robot
        int form = rand.nextInt(12) + 1;
        System.out.println("Random number:" + form + ".");
        // rand for planet
        String alp = "ABC";
        char randPlanet = alp.charAt(rand.nextInt(alp.length()));
        System.out.println("Planet of abduction:" + randPlanet);
        String typePlanet = String.valueOf(randPlanet);

        Robot robot = null;
        ListPlanet planet = null;

        // definition of the form of the robot
        if (form < 4) {
            System.out.println("Form robot - 1");
            robot = new Robot("Baxter", 11.1, 92);
            doRobot(form, robot);
        } else if (form > 3 && form < 9) {
            System.out.println("Form robot - 2");
            robot = new RobotFirst("Wow Wee Mip ", 12, 50, true);
            doRobot(form, robot);
        } else {
            System.out.println("Form robot - 3");
            robot = new RobotUpgrade("R2D2", 7, 30, false, true);
            doRobot(form, robot);
        }

        // definition of the planet of abduction
        switch (typePlanet) {
            case "A":
                planet = ListPlanet.A;
                planet.suit();
                break;
            case "B":
                planet = ListPlanet.B;
                planet.suit();
                break;
            case "C":
                planet = ListPlanet.C;
                planet.suit();
                break;
        }
    }

    public static void doRobot(int form, Robot robot) {
        System.out.println("My model: " + robot.getModel() + "  My speed: " + robot.getSpeed() + " km/h " + " My radius work: " + robot.getWorkArea() + " m.");
        robot.talk();
        robot.run();
        robot.bang();
    }
}


