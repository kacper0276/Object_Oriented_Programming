public class SensorTest {
    public static void Test() {
        TemperatureSensor temperatureSensor = new TemperatureSensor(15, "Test");
        System.out.println("Temperature sensor: " + temperatureSensor.readValue() + " - " + temperatureSensor.getStatus());
        temperatureSensor.reset();

        PressureSensor pressureSensor = new PressureSensor(20, "Sensor");
        System.out.println("Processure sensor: " + pressureSensor.readValue() + " - " + pressureSensor.getStatus());
        pressureSensor.reset();
    }
}
