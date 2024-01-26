package aviation;

public class Pilot implements Cloneable {
    private String name;
    private double[] flightHours;

    public Pilot(String name, double[] flightHours) {
        this.name = name;
        this.flightHours = flightHours != null ? flightHours.clone() : new double[5];
    }

    public void changeThirdPosidion(double value) {
        flightHours[2] = value;
    }

    public double[] getFlightHours() {
        return flightHours;
    }

    @Override
    public Pilot clone() throws CloneNotSupportedException {
        Pilot clone = (Pilot)super.clone();
        clone.flightHours = flightHours.clone();
        return clone;
    }
}
