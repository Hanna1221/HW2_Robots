public class RobotUpgrade extends RobotFirst {
    private boolean artificalIntelligence = true;

    @Override
    public void bang() {

        System.out.println("I don`t kill you. Because I smart.");
    }

    public RobotUpgrade(String model, double speed, double workArea, boolean wifi, boolean artificalIntelligence1) {
        super(model, speed, workArea, wifi);
        this.artificalIntelligence = artificalIntelligence1;
    }

    public boolean isArtificalIntelligence() {
        return artificalIntelligence;
    }
}
