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

        Robot robot = null;
        ListPlanet planet = null;

        // definition of the form of the robot
        if (form < 4) {
            System.out.println("Form robot - 1");
            robot = new Robot("Baxter", 11.1, 92);
            doRobot(robot, randPlanet);
        } else if (form > 3 && form < 9) {
            System.out.println("Form robot - 2");
            robot = new RobotFirst("Wow Wee Mip ", 12, 50, true);
            doRobot(robot, randPlanet);
        } else {
            System.out.println("Form robot - 3");
            robot = new RobotUpgrade("R2D2", 7, 30, false, true);
            doRobot(robot, randPlanet);
        }


    }

    public static void doRobot(Robot robot, char randPlanet) {

        System.out.print("Planet of abduction:");
        String check = String.valueOf(randPlanet);
        ListPlanet ap;

        //definition of the planet of abduction
        switch (check) {
            case "A":
                ap = ListPlanet.valueOf("SEA");
                System.out.println(ap);
                System.out.println(ListPlanet.SEA.getPlanet());
                robot.suit("sea suit.");
                break;
            case "B":
                ap = ListPlanet.valueOf("WIND");
                System.out.println(ap);
                System.out.println(ListPlanet.WIND.getPlanet());
                robot.suit("wind armor");
                break;
            case "C":
                ap = ListPlanet.valueOf("SUN");
                System.out.println(ap);
                System.out.print(ListPlanet.SUN.getPlanet());
                robot.suit("a reflectors.");
                break;
        }
        System.out.println("My model: " + robot.getModel() + "  My speed: " + robot.getSpeed() + " km/h " + " My radius work: " + robot.getWorkArea() + " m.");
        robot.talk();
        robot.run();
        robot.bang();
    }
}


