package transport;

public class TestBusRoute {
    public static void main(String[] args) {
        BusRoute busRoute = new BusRoute("Trasa", "10", "15");
        BusRoute busRoute1 = new BusRoute("Tras", "1", "3");

        System.out.println(busRoute);
        System.out.println(busRoute1);

        if(busRoute.isLongRoute()) {
            System.out.println("Trasa busRoute jest długa");
        }

        if(busRoute1.isLongRoute()) {
            System.out.println("Trasa busRoute1 jest długa");
        }
    }
}
