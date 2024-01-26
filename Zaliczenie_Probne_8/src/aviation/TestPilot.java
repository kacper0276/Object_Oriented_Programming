package aviation;

public class TestPilot {
    public static void main(String[] args) {
        Pilot pilot = new Pilot("Imie", new double[]{5, 2, 1, 3, 5});
        Pilot pilot1 = null;
        try {
            pilot1 = pilot.clone();
            System.out.println(pilot);
            System.out.println(pilot1);
            pilot.changeThirdPosidion(10);
            System.out.println(arrayToString(pilot.getFlightHours()));
            System.out.println(arrayToString(pilot1.getFlightHours()));
        } catch (CloneNotSupportedException e) {
            e.getMessage();
        }
    }

    private static String arrayToString(double[] array) {
        StringBuilder result = new StringBuilder("[");
        for (double value : array) {
            result.append(value).append(", ");
        }
        result.delete(result.length() - 2, result.length());
        result.append("]");
        return result.toString();
    }
}
