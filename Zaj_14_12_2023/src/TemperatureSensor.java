public class TemperatureSensor implements Sensor{
    private double value;
    private  String status;

    public TemperatureSensor(double value, String status) {
        this.value = value;
        this.status = status;
    }

    @Override
    public double readValue() {
        return value;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void reset() {
        System.out.println("Temperature Sensor - Reset");
    }
}
