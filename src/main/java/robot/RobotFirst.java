package main.java.robot;

public class RobotFirst extends Robot {
    private boolean wifi;
    public RobotFirst(String model, double speed, double workArea, boolean wifi) {
        super(model, speed, workArea);
        this.wifi = wifi;
    }
    public boolean isWifi() {
        return wifi;
    }
    @Override
    public void run() {
        System.out.println("Robot start moving after signal on the remote control.");
    }
}



