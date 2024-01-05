package healthcare;

import java.util.Objects;

public class Clinic extends Hospital{
    private double rating;


    public Clinic(String name, double capacity, double rating) {
        super(name, capacity);
        this.rating = rating >= 0.0 && rating <= 5.0 ? rating : 3.0;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if(rating >= 0.0 && rating <= 5.0) {
            this.rating = rating;
        }
    }

    @Override
    public String toString() {
        if(super.getName() == null) {
            return  String.format("[%s]: Capacity: %d., Rating: %d.", this.getClass().getSimpleName(), super.getCapacity(), this.rating);
        }

        return String.format("[%s]: Name: %s. Capacity: %d., Rating: %d.", this.getClass().getSimpleName(), super.getName(), super.getCapacity(), this.rating);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Clinic clinic = (Clinic) o;

        return Objects.equals(super.getName(), clinic.getName()) && Double.valueOf(super.getCapacity()).equals(Double.valueOf(clinic.getCapacity())) && Double.valueOf(rating).equals(Double.valueOf(clinic.rating));
    }

    @Override
    public int hashCode() {
        int result = 17;
        long doubleToLong = Double.doubleToLongBits(super.getCapacity());
        result = result * 31 + (int) (doubleToLong ^ doubleToLong >>> 32);
        long doubleToLongRating = Double.doubleToLongBits(rating);
        result = 31 * result + (int) (doubleToLongRating ^ doubleToLongRating >>> 32);
        result = 31 * result + super.getName().hashCode();

        return result;
    }
}
