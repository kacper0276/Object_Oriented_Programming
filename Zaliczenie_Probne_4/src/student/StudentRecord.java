package student;

import java.text.MessageFormat;

public class StudentRecord {
    private String name;
    private String id;
    private double gpa;

    public StudentRecord(String name, String id, double gpa) {
        if(gpa >= 0.0 && gpa <= 4.0) {
            this.name = name;
            this.id = id;
            this.gpa = gpa;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public boolean isHonorStudent() {
        return this.gpa >= 3.5;
    }

    public void printDetails() {
        System.out.println(String.format("Imie: %s, Id: %s, Gpa: %1.1f", name, id, gpa));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
