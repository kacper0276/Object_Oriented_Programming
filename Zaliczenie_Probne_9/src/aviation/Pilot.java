package aviation;

import java.util.ArrayList;

public class Pilot implements Cloneable{
    private String name;
    private ArrayList<Double> flightHours;

    public Pilot(String name, ArrayList<Double> flightHours) {
        this.name = name;
        this.flightHours = flightHours != null ? new ArrayList<>(flightHours) : new ArrayList<>();
    }

    @Override
    public Pilot clone() throws CloneNotSupportedException {
        Pilot clonePilot = (Pilot) super.clone();
        clonePilot.flightHours = new ArrayList<>(flightHours);
        return clonePilot;
    }

    public void changeThirdEl(double el) {
        flightHours.set(3, el);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getFlightHours() {
        return flightHours;
    }
}
