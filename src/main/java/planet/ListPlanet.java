package main.java.planet;

public enum ListPlanet {
    SEA("I was kidnapped to the  Sea planet."),

    SUN("I was kidnapped to the  Sun planet."),

    WIND("I was kidnapped to the  Wind planet.");

    private String planet;

    ListPlanet(String p) {
        this.planet = p;
    }

    public String getPlanet() {
        return planet;
    }
}