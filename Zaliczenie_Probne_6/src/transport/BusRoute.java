package transport;

public record BusRoute(String routeNumber, String startLocation, String endLocation) {
    public BusRoute {
        if(routeNumber == null || routeNumber.isEmpty()) {
            throw new IllegalArgumentException();
        }
    }

    public boolean isLongRoute() {
        return routeNumber.length() > 4;
    }

    @Override
    public String toString() {
        return "BusRoute{" +
                "routeNumber='" + routeNumber + '\'' +
                ", startLocation='" + startLocation + '\'' +
                ", endLocation='" + endLocation + '\'' +
                '}';
    }
}
