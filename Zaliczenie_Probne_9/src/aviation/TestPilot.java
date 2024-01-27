package aviation;

import java.util.ArrayList;

public class TestPilot {
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

            System.out.println(pilot.getFlightHours());
            System.out.println(pilot1.getFlightHours());

        } catch (CloneNotSupportedException ex) {
            System.out.println(ex);
        }

    }
}
