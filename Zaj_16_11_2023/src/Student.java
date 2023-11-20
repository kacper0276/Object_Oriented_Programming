import java.util.Objects;

public class Student {
    public String firstName, lastName, fieldOfStudy;

    public Student(String firstName, String lastName, String fieldOfStudy) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fieldOfStudy = fieldOfStudy;
    }

    public Student(String firstName, String lastName) {
        this(firstName, lastName, "unknown");
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Student zmienna) {
            return zmienna.fieldOfStudy.equals(this.fieldOfStudy) && zmienna.firstName.equals(this.firstName) && zmienna.lastName.equals(this.lastName);
        }
        return false;
    }
}

class Vehicle {
    public void drive() {
        System.out.println("The vehicle is moving");
    }
}

class Car extends Vehicle {
    @Override
    public void drive() {
        super.drive();
        System.out.println("Klasa Car");
    }
}