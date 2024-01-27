package transport;

import java.util.ArrayList;

public class TestBusStation {
    public static void main(String[] args) {
        BusStation localStation = new BusStation("Local Station", "City A", new ArrayList<>());
        localStation.addBus("Bus1");
        localStation.addBus("Bus2");

        System.out.println("Local Bus Station:");
        System.out.println(localStation);

        localStation.removeBus("Bus1");
        System.out.println("After removing Bus1:");
        System.out.println(localStation);

        IntercityBusStation intercityStation = new IntercityBusStation("Intercity Station", "City B", new ArrayList<>(), 5);
        intercityStation.addBus("BusX");
        intercityStation.addBus("BusY");

        System.out.println("\nIntercity Bus Station:");
        System.out.println(intercityStation);

        intercityStation.removeBus("BusY");
        System.out.println("After removing BusY:");
        System.out.println(intercityStation);
    }
}
