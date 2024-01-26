package aviation;

import java.util.ArrayList;

public class Pilot implements Cloneable{
    private String name;
    private ArrayList<Double> flightHours;

    public Pilot(String name, ArrayList<Double> flightHours) {
        this.name = name;
        this.flightHours = flightHours != null ? flightHours : new ArrayList<>();
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

    public static void main(String[] args) {
        ArrayList<Double> arr = new ArrayList<>();
        arr.add(19.1);
        arr.add(10.0);
        arr.add(9.1);
        arr.add(2.1);

        try {
            Pilot pilot = new Pilot("Imie", arr);
            Pilot pilot1 = null;
            pilot1 = pilot.clone();
            pilot.changeThirdEl(69);

            System.out.println(pilot.flightHours);
            System.out.println(pilot1.flightHours);

        } catch (CloneNotSupportedException ex) {
            System.out.println(ex);
        }

    }
}
