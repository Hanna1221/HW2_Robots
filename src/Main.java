import planet.*;
import robot.*;

import java.util.Random;


public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        // rand for form robot

        int form = rand.nextInt(12) + 1;
        System.out.println("Random number:" + form);

        // rand for planet

        String alp = "ABC";
        char randPlanet = alp.charAt(rand.nextInt(alp.length()));
        System.out.println("Planet of abduction:" + randPlanet);

        // definition of the form of the robot

        if (form < 4) {
            System.out.println("Form robot - 1");
            Robot robot = new Robot("Baxter", 11.1, 92);
            System.out.println("My model: " + robot.getModel() + "  My speed: " + robot.getSpeed() + " km/h " + " My radius work: " + robot.getWorkArea() + " m ");

            robot.run();
            robot.talk();
            robot.bang();
            robot.armor();

        } else if (form > 3 && form < 9) {
            System.out.println("Form robot - 2 ");
            RobotFirst first = new RobotFirst("Wow Wee Mip ", 12, 50, true);
            System.out.println("My model: " + first.getModel() + "  My speed: " + first.getSpeed() + " km/h " + " My radius work: " + first.getWorkArea() + " m " + " I have wi-fi: " + first.isWifi());

            first.run();
            first.talk();
            first.bang();
            first.armor();

        } else {
            System.out.println("Form robot - 3");
            RobotUpgrade second = new RobotUpgrade("R2D2", 7, 30, false, true);
            System.out.println("My model: " + second.getModel() + "  My speed: " + second.getSpeed() + " km/h " + " My radius work: " + second.getWorkArea() + " m " + " I have wi-fi: " + second.isWifi() + " I have intelect: " + second.isArtificalIntelligence());
            second.run();
            second.bang();
            second.armor();

        }


        // definition of the planet of abduction

        if (randPlanet == 'A') {
            System.out.println("I was kidnapped to the Sea planet");
            listPlanet planetSea = listPlanet.SEA;

            planetSea.suit();

        } else if (randPlanet == 'B') {
            System.out.println("I was kidnapped to the  Wind planet");
            listPlanet planetWind = listPlanet.WIND;
            planetWind.suit();
        } else {
            System.out.println("I was kidnapped to the  Sun planet");
            listPlanet planetSun = listPlanet.SUN;
            planetSun.suit();
        }
    }
}
