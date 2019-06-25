package main.java.planet;

public enum ListPlanet implements Planet {

    A {
        @Override
        public void suit(String namePlanet) {
            System.out.println("I was kidnapped to the  Sea planet");
            System.out.println("My armor is a water suit.");
        }
    },
    B {
        @Override
        public void suit(String namePlanet) {
            System.out.println("I was kidnapped to the  Wind planet");
            System.out.println("My armor is a wind armor");
        }
    },
    C {
        @Override
        public void suit(String namePlanet) {
            System.out.println("I was kidnapped to the  Sun planet");
            System.out.println("My armor is a reflectors");
        }
    }
}
