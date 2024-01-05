package moto;

public class Vehicle implements Comparable<Vehicle>{
    public String model;
    public int speed;

    public Vehicle(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public int compareTo(Vehicle o) {
        return this.speed - o.speed;
    }
}
